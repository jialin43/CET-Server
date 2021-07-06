package cn.nwafu.cet.controller;

import java.util.List;

import cn.nwafu.cet.common.HttpResult;
import cn.nwafu.cet.common.PageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import cn.nwafu.cet.model.Density;
import cn.nwafu.cet.service.DensityService;

/**
 * ---------------------------
 *  (DensityController)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2020-10-08 16:05:25
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@RestController
@RequestMapping("density")
public class DensityController {

	@Autowired
	private DensityService densityService;

	/**
	 * 保存
	 * @param record
	 * @return
	 */	
	@PostMapping(value="/save")
	public HttpResult save(@RequestBody Density record) {
		return HttpResult.ok(densityService.save(record));
	}

    /**
     * 删除
     * @param records
     * @return
     */
	@PostMapping(value="/delete")
	public HttpResult delete(@RequestBody List<Density> records) {
		return HttpResult.ok(densityService.delete(records));
	}

    /**
     * 基础分页查询
     * @param pageRequest
     * @return
     */    
	@PostMapping(value="/findPage")
	public HttpResult findPage(@RequestBody PageRequest pageRequest) {
		return HttpResult.ok(densityService.findPage(pageRequest));
	}
	
    /**
     * 根据主键查询
     * @param id
     * @return
     */ 	
	@GetMapping(value="/findById")
	public HttpResult findById(@RequestParam Integer id) {
		return HttpResult.ok(densityService.findById(id));
	}
	@GetMapping(value="/findByCas")
	public HttpResult findByCas(@RequestParam String cas) {
		return HttpResult.ok(densityService.findByCas(cas));
	}
}
