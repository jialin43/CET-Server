package cn.nwafu.cet.service;

import cn.nwafu.cet.model.Menu;
import cn.nwafu.cet.model.Role;

import java.util.List;


/**
 * ---------------------------
 *  (MenuService)         
 * ---------------------------
 * 作者：  Johnny
 * 时间：  2020-10-08 15:14:13
 * 说明：
 * ---------------------------
 */
public interface MenuService extends CurdService<Menu> {

    List<Menu> findMenuByRole(Role role);
}
