package cn.nwafu.cet.controller;

import cn.nwafu.cet.common.HttpResult;
import cn.nwafu.cet.dto.EmailPassword;
import cn.nwafu.cet.dto.LoginBean;
import cn.nwafu.cet.model.MailReset;
import cn.nwafu.cet.model.User;
import cn.nwafu.cet.security.JwtAuthenticationToken;
import cn.nwafu.cet.service.MailResetService;
import cn.nwafu.cet.service.MailService;
import cn.nwafu.cet.service.UserService;
import cn.nwafu.cet.utils.PasswordUtils;
import cn.nwafu.cet.utils.SecurityUtils;
import org.apache.tomcat.util.security.MD5Encoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.security.MessageDigest;
import java.sql.Timestamp;
import java.util.UUID;

@RestController
public class LoginController {
    Logger log = LoggerFactory.getLogger(cn.nwafu.cet.controller.LoginController.class);
    private final AuthenticationManager authenticationManager;
    private final UserService userService;
    private final MailService mailService;
    private final MailResetService mailResetService;
    public LoginController(AuthenticationManager authenticationManager, UserService userService, MailService mailService, MailResetService mailResetService) {
        this.authenticationManager = authenticationManager;
        this.userService = userService;
        this.mailService = mailService;
        this.mailResetService = mailResetService;
    }

    /**
     * 登录接口
     */
    @PostMapping(value = "/login")
    public HttpResult login(@RequestBody LoginBean loginBean, HttpServletRequest request) throws IOException {
        String username = loginBean.getAccount();
        String password = loginBean.getPassword();
        // 用户信息
        User user = userService.findByName(username);

        // 账号不存在、密码错误
        if (user == null) {
            log.info("账号不存在");
            return HttpResult.error("账号不存在");
        }
        if(user.getStatus() ==0){
            return HttpResult.error("该账号未审核，请等待管理员审核");
        }
        if(user.getStatus() ==2){
            return HttpResult.error("该账号已停用");
        }
        if(user.getStatus() ==1){
            if (!PasswordUtils.matches(user.getSalt(), password, user.getPassword())) {
                return HttpResult.error("密码不正确");
            }
            // 系统登录认证
            JwtAuthenticationToken token = SecurityUtils.login(request, username, password, authenticationManager);
            token.setNickname(user.getNickname());
            token.eraseCredentials();
            return HttpResult.ok(token);
        }
        return HttpResult.error("登录失败");
    }
    @GetMapping(value = "sendEmail")
    @ResponseBody
    public HttpResult sendEmail(HttpServletRequest request,@RequestParam String email){
        User user = userService.findByEmail(email);
        if(user==null){
            return HttpResult.error("该邮箱未绑定用户");
        }else {
            String verifyCode = generateVerifyCode(user);
            String content = "验证码:"+verifyCode+",验证码有效期10分钟，请勿泄露给他人。";
            mailService.sendMail("重置您的CET密码",email,content);
            System.out.println("邮件已发送");
            return HttpResult.ok("重置密码邮件已发送给该用户，请注意查收");
        }

    }
    public String generateResetUrl(String baseUrl,String mail) {
        String key = UUID.randomUUID().toString().substring(0,7);
        Timestamp expireDate = new Timestamp(System.currentTimeMillis()+(long)(10*60*1000));
        String sid = mail+"&"+key+"&" +expireDate.getTime();
        MailReset mailReset = mailResetService.findByMail(mail);
        if(mailReset!=null){
            mailResetService.delete(mailReset);
        }
        mailReset = new MailReset();
        mailReset.setEmail(mail);
        mailReset.setSid(sid);
        mailReset.setExpireTime(expireDate);
        mailResetService.save(mailReset);
        String uniqueUrl = baseUrl+"resetpassword?sid="+ DigestUtils.md5DigestAsHex(sid.getBytes())+"&email="+mail;
        System.out.println(uniqueUrl);
        return uniqueUrl;
    }
    public String generateVerifyCode(User user) {
        String key = UUID.randomUUID().toString().substring(0,4);
        Timestamp expireDate = new Timestamp(System.currentTimeMillis()+(long)(10*60*1000));
        MailReset mailReset = mailResetService.findByMail(user.getEmail());
        if(mailReset!=null){
            mailResetService.delete(mailReset);
        }
        mailReset = new MailReset();
        mailReset.setEmail(user.getEmail());
        mailReset.setSid(key);
        mailReset.setExpireTime(expireDate);
        mailResetService.save(mailReset);
        return key;
    }
    @PostMapping(value = "resetpassword")
    public HttpResult resetPassword(@RequestBody EmailPassword emailPassword){
        MailReset mailReset = mailResetService.findByMail(emailPassword.getEmail());
        if(mailReset==null){
            return HttpResult.error(101,"验证码已失效，请重新获取");
        }else {
            if(mailReset.getSid().equals(emailPassword.getVerifyCode())){
                //验证码正确，检查失效时间
                if(mailReset.getExpireTime().after(new Timestamp(System.currentTimeMillis()))){
                    //有效时间，可以重置密码
                    if(emailPassword.getNewPassword().equals(emailPassword.getConfirmPassword())){
                        User user = userService.findByEmail(emailPassword.getEmail());
                        System.out.println(user.getSalt());
                        String newPassword = PasswordUtils.encode(emailPassword.getNewPassword(),user.getSalt());
                        user.setPassword(newPassword);
                        userService.updateUser(user);
                    }
                }else {
                    return HttpResult.error(102,"验证码已失效，请重新获取");
                }
            }else {
                return HttpResult.error(103,"验证码无效");
            }
        }
        return HttpResult.ok("密码重置成功");
    }

}
