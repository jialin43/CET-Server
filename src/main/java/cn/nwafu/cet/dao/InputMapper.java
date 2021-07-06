package cn.nwafu.cet.dao;

import java.util.List;

import cn.nwafu.cet.model.Input;
import org.apache.ibatis.annotations.Param;

/**
 * ---------------------------
 *  (InputMapper)         
 * ---------------------------
 * 作者：  Johnny
 * 时间：  2020-10-08 15:14:13
 * 说明：
 * ---------------------------
 */
public interface InputMapper {

	/**
	 * 添加
	 * @param record
	 * @return
	 */
    int add(Input record);

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
    int update(Input record);
    
    /**
     * 根据主键查询
     * @param id
     * @return
     */    
    Input findById(Integer id);
    Input findByCas(@Param(value="cas")String cas ,@Param(value="creator")String creator);
    /**
     * 基础分页查询
     * @param record
     * @return
     */    
    List<Input> findPage(String creator);

    List<Input> findPageByCas(@Param(value="cas")String cas,@Param(value="creator")String creator);
    
}