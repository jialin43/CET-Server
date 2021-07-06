package cn.nwafu.cet.controller;

import java.util.List;
import java.util.logging.Logger;

import cn.nwafu.cet.model.Role;
import cn.nwafu.cet.model.User;
import cn.nwafu.cet.service.RoleService;
import cn.nwafu.cet.service.UserService;

import cn.nwafu.cet.utils.SecurityUtils;
import org.springframework.web.bind.annotation.*;

import cn.nwafu.cet.common.HttpResult;
import cn.nwafu.cet.service.MenuService;

/**
 * ---------------------------
 *  (MenuController)         
 * ---------------------------
 * 作者：  Johnny
 * 时间：  2020-10-08 15:14:13
 * 说明：
 * ---------------------------
 */
@RestController
@RequestMapping("menu")
public class MenuController {
		final MenuService menuService;
		final UserService userService;
		final RoleService roleService;

		public MenuController(MenuService menuService, UserService userService, RoleService roleService) {
			this.menuService = menuService;
			this.userService = userService;
			this.roleService = roleService;
		}

		@GetMapping(value = "findNavTree")
		@ResponseBody
		// TODO 没有权限过滤能够查询所有菜单@2020.10.09
		public HttpResult findNavTree() {
			String userName = SecurityUtils.getUsername();
			User user = userService.findByName(userName);
			Role role = new Role();
			role.setId(Integer.valueOf(user.getRole()));
			return HttpResult.ok(menuService.findMenuByRole(role));
		}


}
