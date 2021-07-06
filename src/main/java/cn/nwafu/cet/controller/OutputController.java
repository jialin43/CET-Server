package cn.nwafu.cet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.nwafu.cet.common.HttpResult;
import cn.nwafu.cet.common.PageRequest;

import cn.nwafu.cet.model.Output;
import cn.nwafu.cet.service.OutputService;

/**
 * ---------------------------
 *  (OutputController)         
 * ---------------------------
 * 作者：  Johnny
 * 时间：  2020-10-08 15:14:13
 * 说明：
 * ---------------------------
 */
@RestController
@RequestMapping("output")
public class OutputController {

	@Autowired
	private OutputService outputService;

	/**
	 * 保存
	 * @param record
	 * @return
	 */	
	@PostMapping(value="/save")
	public HttpResult save(@RequestBody Output record) {
		return HttpResult.ok(outputService.save(record));
	}

	@PostMapping(value="/update")
	public HttpResult update(@RequestBody Output record) {
		return HttpResult.ok(outputService.update(record));
	}

	/**
     * 删除
     * @param records
     * @return
     */
	@PostMapping(value="/delete")
	public HttpResult delete(@RequestBody Output record) {
		return HttpResult.ok(outputService.delete(record));
	}

    /**
     * 基础分页查询
     * @param pageRequest
     * @return
     */    
	@PostMapping(value="/findPage")
	public HttpResult findPage(@RequestBody PageRequest pageRequest) {
		return HttpResult.ok(outputService.findPage(pageRequest));
	}
	
    /**
     * 根据主键查询
     * @param id
     * @return
     */ 	
	@GetMapping(value="/findById")
	public HttpResult findById(@RequestParam Integer id) {
		return HttpResult.ok(outputService.findById(id));
	}

	@PostMapping(value="/findByCasAndCreator")
	public HttpResult findByCasAndCreator(@RequestParam String cas) {
		return HttpResult.ok(outputService.findByCasAndCreator(cas));
	}

}
