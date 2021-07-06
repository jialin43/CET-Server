package cn.nwafu.cet.dao;

import java.util.List;

import cn.nwafu.cet.model.Density;

/**
 * ---------------------------
 *  (DensityMapper)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2020-10-08 16:05:25
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
public interface DensityMapper {

	/**
	 * 添加
	 * @param record
	 * @return
	 */
    int add(Density record);

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
    int update(Density record);
    
    /**
     * 根据主键查询
     * @param id
     * @return
     */    
    Density findById(Integer id);

    /**
     * 基础分页查询
     * @param record
     * @return
     */    
    List<Density> findPage(String creator);
    Density findByCas(String cas,String creator);
    void deleteByCas(String cas,String creator);
    
}