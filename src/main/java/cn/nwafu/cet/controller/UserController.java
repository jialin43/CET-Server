package cn.nwafu.cet.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.List;

import cn.nwafu.cet.common.PageRequest;
import cn.nwafu.cet.dto.PasswordBean;
import cn.nwafu.cet.service.InputService;
import cn.nwafu.cet.service.MailService;
import cn.nwafu.cet.utils.PasswordUtils;
import cn.nwafu.cet.utils.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import cn.nwafu.cet.common.HttpResult;
import cn.nwafu.cet.model.User;
import cn.nwafu.cet.service.UserService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.http.MediaType;
import java.io.File;
import java.util.UUID;

/**
 * ---------------------------
 *  (UserController)         
 * ---------------------------
 * 作者：  Johnny
 * 时间：  2020-10-08 15:14:13
 * 说明：
 * ---------------------------
 */
@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userService;
	@Autowired
	private InputService inputService;
	@Autowired
	private MailService mailService;
	@Value("${file.path}")
	private String path;
	/**
	 * 保存
	 *
	 * @param record
	 * @return
	 */
	@PostMapping(value = "/save")
	public HttpResult save(@RequestBody User record) {
		return HttpResult.ok(userService.save(record));
	}

	/**
	 * 基础分页查询
	 *
	 * @param pageRequest
	 * @return
	 */
	@PostMapping(value = "/findPage")
	public HttpResult findPage(@RequestBody PageRequest pageRequest) {
		return HttpResult.ok(userService.findPage(pageRequest));
	}


	@RequestMapping(value = "/",method = RequestMethod.POST)
	@ResponseBody
	public HttpResult addUser(MultipartFile file,@RequestBody User user) {
		if (userService.findByName(user.getUsername()) != null) {
			return HttpResult.error("用户名已存在!");
		}
		if (userService.findByEmail(user.getEmail()) != null) {
			return HttpResult.error("该邮箱已注册!");
		}
		String salt = PasswordUtils.getSalt();
		String password = PasswordUtils.encode(user.getPassword(), salt);
		user.setPassword(password);
		user.setSalt(salt);
		Date date = new Date();
		user.setGmtCreate(date);
		user.setGmtModified(date);
		int result = userService.save(user);
		User admin = userService.findByName("admin");
		if(admin!=null){
			String subject = "您有新的待审核CET用户";
			String content = "用户名："+user.getUsername()+",联系方式："+user.getMobile()+",公司："+user.getCompany()+"。";
			mailService.sendMail(subject,admin.getEmail(),content);
			System.out.println("发送待审核邮件");
		}
		return HttpResult.ok(result);
	}

	@RequestMapping(value = "/",method = RequestMethod.PUT)
	@ResponseBody
	public HttpResult updateUser(@RequestBody User user) {
		Date date = new Date();
		user.setGmtModified(date);
		User oldUser = userService.findById(user.getId());
		if(oldUser.getStatus()==0 &&user.getStatus()==1){
			//给用户邮箱发送审核通过的邮件
			String subject = "您的CET账号审核通过";
			String email = user.getEmail();
			String content = "您的账号为: "+user.getUsername()+" ,请注意保管好密码";
			mailService.sendMail(subject,email,content);
		}
		return HttpResult.ok(userService.updateUser(user));
	}

	@RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
	@ResponseBody
	public HttpResult delUser(User user) {
		userService.delUser(user);
		return HttpResult.ok();
	}


	@DeleteMapping(value="/")
	public HttpResult delete(@RequestBody List<User> records) {

		return HttpResult.ok(userService.batchDelUser(records));
	}

	//@PostMapping("/changePassword")
	@RequestMapping(value = "/changePassword",method = RequestMethod.POST)
	@ResponseBody
	public HttpResult changePassword(@RequestBody PasswordBean passwordBean) {
		String oldPassword = passwordBean.getOldPassword();
		String newPassword = passwordBean.getNewPassword();
		String userName = SecurityUtils.getUsername();
		User user = userService.findByName(userName);
		if (user == null){
			return HttpResult.error(50001,"该用戶不存在！");
		}
		// 若用户存在，则校验旧密码
		boolean flag =  PasswordUtils.matches(user.getSalt(),oldPassword,user.getPassword());
		if (!flag){
			return HttpResult.error(50002,"旧密码校验失败！");
		}
		// 若旧密码校验正确，则修改密码
		String passwordEncode = PasswordUtils.encode(newPassword, user.getSalt());
		user.setPassword(passwordEncode);
		userService.updateUser(user);
		return HttpResult.ok("密码修改成功！");
	}


	@ResponseBody
	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public HttpResult upload(MultipartFile file) {
		String fileName = file.getOriginalFilename();
		String suffixName = fileName.substring(fileName.lastIndexOf("."));
		fileName = UUID.randomUUID() + suffixName;
		try {
			file.transferTo(new File(path + fileName));
		} catch (Exception e) {
			e.printStackTrace();
			e.printStackTrace();
			return HttpResult.error("上传失败");
		}
		String filepath=path+fileName;
		return HttpResult.ok(filepath);
	}

	@RequestMapping(value = "downloaddemo" ,method = RequestMethod.GET)
	public ResponseEntity<byte[]> downloadDemo() throws IOException {
		// 读取pdf文件到字节里
		String demoPath = path+"demo.docx";
		return download(demoPath,"demo.docx");
	}
	@RequestMapping(value = "downloadprove" ,method = RequestMethod.GET)
	public ResponseEntity<byte[]> downloadProve(@RequestParam String username) throws IOException {
		// 读取pdf文件到字节里
		User user = userService.findByName(username);
		if(user!=null){
			String filePath = user.getFilepath();
			return download(filePath,user.getUsername());

		}
		return null;
	}
	public ResponseEntity<byte[]> download(String filePath,String fileName) throws IOException {
		Path path = Paths.get(filePath);
		byte[] contents = Files.readAllBytes(path);
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.parseMediaType("application/msword"));
		headers.add("content-disposition", "inline;filename=" + fileName);
		headers.setCacheControl("must-revalidate, post-check=0, pre-check=0");
		return new ResponseEntity<>(contents, headers, HttpStatus.OK);
	}
	@ResponseBody
	@GetMapping(value = "/getcurrentuser")
	public HttpResult getCurrentUser() {
		return HttpResult.ok(SecurityUtils.getUsername());
	}

	@ResponseBody
	@GetMapping(value = "checkusernameexist")
	public HttpResult checkUsernameExist(String username) {
		User user = userService.findByName(username);
		if(user!=null){
			return HttpResult.error(100,"用户名已存在");
		}else {
			return HttpResult.ok();
		}


	}
	@ResponseBody
	@GetMapping(value = "checkemailexist")
	public HttpResult checkEmailExist(String email) {
		User user = userService.findByEmail(email);
		if(user!=null){
			return HttpResult.error(100,"该邮箱已注册");
		}else {
			return HttpResult.ok();
		}


	}

}