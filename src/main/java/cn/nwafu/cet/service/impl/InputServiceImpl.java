package cn.nwafu.cet.service.impl;

import java.util.List;

import cn.nwafu.cet.dao.DensityMapper;
import cn.nwafu.cet.dao.OutputMapper;
import cn.nwafu.cet.dao.ParameterMapper;
import cn.nwafu.cet.model.Density;
import cn.nwafu.cet.model.Parameter;
import cn.nwafu.cet.utils.SecurityUtils;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.nwafu.cet.common.MybatisPageHelper;
import cn.nwafu.cet.common.PageRequest;
import cn.nwafu.cet.common.PageResult;

import cn.nwafu.cet.model.Input;
import cn.nwafu.cet.dao.InputMapper;
import cn.nwafu.cet.service.InputService;

/**
 * ---------------------------
 *  (InputServiceImpl)         
 * ---------------------------
 * 作者：  Johnny
 * 时间：  2020-10-08 15:14:13
 * 说明：
 * ---------------------------
 */
@Service
public class InputServiceImpl implements InputService {

	@Autowired
	private InputMapper inputMapper;
	@Autowired
	private DensityMapper densityMapper;
	@Autowired
	private ParameterMapper parameterMapper;
	@Autowired
	private OutputMapper outputMapper;

	@Override
	public int save(Input record) {
		if(record.getId() == null || record.getId() == 0) {
			Density density = new Density();
			density.setCas(record.getCas());
			Parameter parameter = new Parameter();
			parameter.setCas(record.getCas());
			densityMapper.add(density);
			parameterMapper.add(parameter);
			return inputMapper.add(record);
		}
		return inputMapper.update(record);
	}

	@Override
	public int delete(Input record) {
		String creator = SecurityUtils.getUsername();
		Input input = inputMapper.findById(record.getId());
		densityMapper.deleteByCas(input.getCas(),creator);
		parameterMapper.deleteByCas(input.getCas(),creator);
		outputMapper.deleteByCas(input.getCas(),creator);
		return inputMapper.delete(record.getId());
	}

	@Override
	public int delete(List<Input> records) {
		for(Input record:records) {
			delete(record);
		}
		return 1;
	}

	@Override
	public Input findById(Integer id) {
		return inputMapper.findById(id);
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		PageResult pageResult = null;
		String cas = MybatisPageHelper.getColumnFilterValue(pageRequest,"label");
		String creator = SecurityUtils.getUsername();
		if (cas!=null){
			pageResult = MybatisPageHelper.findPage(pageRequest,inputMapper,"findPageByCas",cas,creator);
		} else {
			pageResult  = MybatisPageHelper.findPage(pageRequest, inputMapper,creator);
		}
		return pageResult;
	}

	@Override
	public List<Input> findAll() {
		String creator = SecurityUtils.getUsername();
		return inputMapper.findPage(creator);
	}

	@Override
	public Input findByCas(String cas) {
		String creator = SecurityUtils.getUsername();
		return inputMapper.findByCas(cas,creator);
	}

	@Override
	public void saveAs(String oldCas,Input input) {
		String creator = SecurityUtils.getUsername();
		Density density = densityMapper.findByCas(oldCas,creator);
		Parameter parameter = parameterMapper.findByCas(oldCas,creator);
		density.setCas(input.getCas());
		parameter.setCas(input.getCas());
		inputMapper.add(input);
		densityMapper.add(density);
		parameterMapper.add(parameter);
	}
}
