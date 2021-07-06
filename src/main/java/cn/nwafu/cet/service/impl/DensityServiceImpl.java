package cn.nwafu.cet.service.impl;

import cn.nwafu.cet.common.PageRequest;
import cn.nwafu.cet.common.PageResult;
import cn.nwafu.cet.dao.DensityMapper;
import cn.nwafu.cet.model.Density;
import cn.nwafu.cet.service.DensityService;
import cn.nwafu.cet.utils.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * ---------------------------
 *  (DensityServiceImpl)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2020-10-08 16:05:25
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@Service
public class DensityServiceImpl implements DensityService {

	@Autowired
	private DensityMapper densityMapper;

	@Override
	public int save(Density record) {
		String creator = SecurityUtils.getUsername();
		Density density = densityMapper.findByCas(record.getCas(),creator);
		if(density==null) {
			return densityMapper.add(record);
		}
		return densityMapper.update(record);
	}

	@Override
	public int delete(Density record) {
		return 0;
	}

	@Override
	public int delete(List<Density> records) {
		for(Density record:records) {
			delete(record);
		}
		return 1;
	}

	@Override
	public Density findById(Integer id) {
		return densityMapper.findById(id);
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		return null;
	}


	@Override
	public Density findByCas(String cas) {
		String creator = SecurityUtils.getUsername();
		return densityMapper.findByCas(cas,creator);
	}
}
