package cn.nwafu.cet.service.impl;

import java.util.List;

import cn.nwafu.cet.utils.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.nwafu.cet.common.MybatisPageHelper;
import cn.nwafu.cet.common.PageRequest;
import cn.nwafu.cet.common.PageResult;

import cn.nwafu.cet.model.Parameter;
import cn.nwafu.cet.dao.ParameterMapper;
import cn.nwafu.cet.service.ParameterService;

/**
 * ---------------------------
 *  (ParameterServiceImpl)         
 * ---------------------------
 * 作者：  Johnny
 * 时间：  2020-10-08 15:14:13
 * 说明：
 * ---------------------------
 */
@Service
public class ParameterServiceImpl implements ParameterService {

	@Autowired
	private ParameterMapper parameterMapper;

	@Override
	public int save(Parameter record) {
		String creator = SecurityUtils.getUsername();
		Parameter parameter = parameterMapper.findByCas(record.getCas(),creator);
		if(parameter ==null){
			return parameterMapper.add(record);
		}
		return parameterMapper.update(record);
	}

	@Override
	public int delete(Parameter record) {
		return 0;
	}

	@Override
	public int delete(List<Parameter> records) {
		return 0;
	}

	@Override
	public Parameter findById(Integer id) {
		return parameterMapper.findById(id);
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		return null;
	}

	@Override
	public Parameter findByCas(String cas) {
		String creator = SecurityUtils.getUsername();
		return parameterMapper.findByCas(cas,creator);
	}
}