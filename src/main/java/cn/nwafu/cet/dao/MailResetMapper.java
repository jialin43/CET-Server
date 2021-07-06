package cn.nwafu.cet.dao;

import java.util.List;

import cn.nwafu.cet.model.MailReset;

/**
 * ---------------------------
 *  (MailResetMapper)
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2020-12-29 09:45:55
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
public interface MailResetMapper {

	/**
	 * 添加
	 * @param record
	 * @return
	 */
    int add(MailReset record);

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
    int update(MailReset record);
    
    /**
     * 根据主键查询
     * @param id
     * @return
     */    
    MailReset findById(Integer id);
    MailReset findByMail(String email);
    /**
     * 基础分页查询
     * @param record
     * @return
     */    
    List<MailReset> findPage();
    
}