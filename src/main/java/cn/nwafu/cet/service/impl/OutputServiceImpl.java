package cn.nwafu.cet.service.impl;

import java.util.List;

import cn.nwafu.cet.utils.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.nwafu.cet.common.MybatisPageHelper;
import cn.nwafu.cet.common.PageRequest;
import cn.nwafu.cet.common.PageResult;

import cn.nwafu.cet.model.Output;
import cn.nwafu.cet.dao.OutputMapper;
import cn.nwafu.cet.service.OutputService;

/**
 * ---------------------------
 *  (OutputServiceImpl)         
 * ---------------------------
 * 作者：  Johnny
 * 时间：  2020-10-08 15:14:13
 * 说明：
 * ---------------------------
 */
@Service
public class OutputServiceImpl implements OutputService {

	@Autowired
	private OutputMapper outputMapper;

	@Override
	public int save(Output record) {
		if(outputMapper.findById(record.getId()) == null){
			return outputMapper.add(record);
		}
		else{
			return outputMapper.update(record);
		}
	}

	@Override
	public int delete(Output record) {
		return outputMapper.delete(record.getId());
	}

	@Override
	public int update(Output record) {
		return outputMapper.update(record);
	}

	@Override
	public int delete(List<Output> records) {
		for(Output record:records) {
			delete(record);
		}
		return 1;
	}

	@Override
	public Output findById(Integer id) {
		return null;
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		return MybatisPageHelper.findPage(pageRequest, outputMapper);
	}

	@Override
	public List<Output> findByCasAndCreator(String cas){
		String creator = SecurityUtils.getUsername();
		return outputMapper.findByCasAndCreator(cas,creator);
	}
}
