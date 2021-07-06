package cn.nwafu.cet.dao;

import java.util.List;

import cn.nwafu.cet.model.Output;

/**
 * ---------------------------
 *  (OutputMapper)         
 * ---------------------------
 * 作者：  Johnny
 * 时间：  2020-10-08 15:14:13
 * 说明：
 * ---------------------------
 */
public interface OutputMapper {

	/**
	 * 添加
	 * @param record
	 * @return
	 */
    int add(Output record);

    /**
     * 删除
     * @param id
     * @return
     */
    int delete(int id);
    
    /**
     * 修改
     * @param record
     * @return
     */
    int update(Output record);
    
    /**
     * 根据主键查询
     * @param id
     * @return
     */    
    Output findById(int id);

    /**
     * 基础分页查询
     * @param
     * @return
     */    
    List<Output> findPage();

    List<Output> findByCasAndCreator(String cas, String creator);
    void deleteByCas(String cas,String creator);
    
}