package cn.nwafu.cet.dao;

import java.util.List;

import cn.nwafu.cet.model.Parameter;

/**
 * ---------------------------
 *  (ParameterMapper)         
 * ---------------------------
 * 作者：  Johnny
 * 时间：  2020-10-08 15:14:13
 * 说明：
 * ---------------------------
 */
public interface ParameterMapper {

	/**
	 * 添加
	 *
	 * @param record
	 * @return
	 */
	int add(Parameter record);
	int update(Parameter parameter);
	Parameter findById(int id);
	Parameter findByCas(String cas,String creator);
	void deleteByCas(String cas,String creator);
}