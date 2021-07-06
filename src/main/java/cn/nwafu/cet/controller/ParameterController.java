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

import cn.nwafu.cet.model.Parameter;
import cn.nwafu.cet.service.ParameterService;

/**
 * ---------------------------
 *  (ParameterController)         
 * ---------------------------
 * 作者：  Johnny
 * 时间：  2020-10-08 15:14:13
 * 说明：
 * ---------------------------
 */
@RestController
@RequestMapping("parameter")
public class ParameterController {

	@Autowired
	private ParameterService parameterService;

	/**
	 * 保存
	 *
	 * @param record
	 * @return
	 */
	@PostMapping(value = "/save")
	public HttpResult save(@RequestBody Parameter record) {
		return HttpResult.ok(parameterService.save(record));
	}

	/**
	 * 删除
	 *
	 * @param records
	 * @return
	 */
	@PostMapping(value = "/delete")
	public HttpResult delete(@RequestBody List<Parameter> records) {
		return HttpResult.ok(parameterService.delete(records));
	}

	/**
	 * 基础分页查询
	 *
	 * @param pageRequest
	 * @return
	 */
	@PostMapping(value = "/findPage")
	public HttpResult findPage(@RequestBody PageRequest pageRequest) {
		return HttpResult.ok(parameterService.findPage(pageRequest));
	}
	@GetMapping(value="/findById")
	public HttpResult findById(@RequestParam Integer id) {
		return HttpResult.ok(parameterService.findById(id));
	}
	@GetMapping(value="/findByCas")
	public HttpResult findByCas(@RequestParam String cas) {
		return HttpResult.ok(parameterService.findByCas(cas));
	}
}
