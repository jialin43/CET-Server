package cn.nwafu.cet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.nwafu.cet.common.HttpResult;
import cn.nwafu.cet.common.PageRequest;

import cn.nwafu.cet.model.Role;
import cn.nwafu.cet.service.RoleService;

/**
 * ---------------------------
 *  (RoleController)         
 * ---------------------------
 * 作者：  Johnny
 * 时间：  2020-10-08 15:14:13
 * 说明：
 * ---------------------------
 */
@RestController
@RequestMapping("role")
public class RoleController {

	@Autowired
	private RoleService roleService;

	/**
	 * 保存
	 * @param record
	 * @return
	 */	
	@PostMapping(value="/save")
	public HttpResult save(@RequestBody Role record) {
		return HttpResult.ok(roleService.save(record));
	}

    /**
     * 删除
     * @param records
     * @return
     */
	@PostMapping(value="/delete")
	public HttpResult delete(@RequestBody List<Role> records) {
		return HttpResult.ok(roleService.delete(records));
	}

    /**
     * 基础分页查询
     * @param pageRequest
     * @return
     */    
	@PostMapping(value="/findPage")
	public HttpResult findPage(@RequestBody PageRequest pageRequest) {
		return HttpResult.ok(roleService.findPage(pageRequest));
	}
	
    /**
     * 根据主键查询
     * @param id
     * @return
     */ 	
	@GetMapping(value="/findById")
	public HttpResult findById(@RequestParam Integer id) {
		return HttpResult.ok(roleService.findById(id));
	}
}
