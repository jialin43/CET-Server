package cn.nwafu.cet.dao;

import java.util.List;

import cn.nwafu.cet.model.Menu;

/**
 * ---------------------------
 *  (MenuMapper)         
 * ---------------------------
 * 作者：  Johnny
 * 时间：  2020-10-08 15:14:13
 * 说明：
 * ---------------------------
 */
public interface MenuMapper {

	/**
	 * 添加
	 * @param record
	 * @return
	 */
    int add(Menu record);

    /**
     * 删除
     * @param id
     * @return
     */
    int delete(Integer id);
    
    /**
     * 修改
     * @param record
     * @return
     */
    int update(Menu record);
    
    /**
     * 根据主键查询
     * @param id
     * @return
     */    
    Menu findById(Integer id);

    /**
     * 基础分页查询
     * @param record
     * @return
     */    
    List<Menu> findPage();
    List<Menu> findMenuByRole(int role);
    
}