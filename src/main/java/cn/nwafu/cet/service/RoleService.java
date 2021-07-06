package cn.nwafu.cet.service;

import cn.nwafu.cet.model.Role;
import cn.nwafu.cet.model.User;
import cn.nwafu.cet.service.CurdService;

/**
 * ---------------------------
 *  (RoleService)         
 * ---------------------------
 * 作者：  Johnny
 * 时间：  2020-10-08 15:14:13
 * 说明：
 * ---------------------------
 */
public interface RoleService extends CurdService<Role> {

    Role findRoleByUser(User user);
}
