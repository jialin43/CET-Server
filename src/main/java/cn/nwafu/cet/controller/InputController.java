package cn.nwafu.cet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import cn.nwafu.cet.common.HttpResult;
import cn.nwafu.cet.common.PageRequest;

import cn.nwafu.cet.model.Input;
import cn.nwafu.cet.service.InputService;

/**
 * ---------------------------
 *  (InputController)         
 * ---------------------------
 * 作者：  Johnny
 * 时间：  2020-10-08 15:14:13
 * 说明：
 * ---------------------------
 */
@RestController
@RequestMapping("input")
public class InputController {

	@Autowired
	private InputService inputService;

	/**
	 * 保存
	 * @param record
	 * @return
	 */	
	@PostMapping(value="/save")
	@ResponseBody
	public HttpResult save(@RequestBody Input record) {
		Input oldinput = inputService.findById(record.getId());
		if(oldinput != null){
			//saveAs
			Input sourceInput = inputService.findByCas(record.getCas());
			if(sourceInput==null){
				//saveAs
				inputService.saveAs(oldinput.getCas(),record);
			}else {
				//update
				inputService.save(record);
			}

		}else {
			//add
			Input existInput = inputService.findByCas(record.getCas());
			if(existInput!=null) {
				return HttpResult.error("物质已存在");
			}
			inputService.save(record);


		}

		return HttpResult.ok();

	}

    /**
     * 删除
     * @param records
     * @return
     */
	@PostMapping(value="/delete")
	@ResponseBody
	public HttpResult delete(@RequestBody List<Input> records) {
		return HttpResult.ok(inputService.delete(records));
	}

    /**
     * 基础分页查询
     * @param pageRequest
     * @return
     */    
	@PostMapping(value="/findPage")
	@ResponseBody
	public HttpResult findPage(@RequestBody PageRequest pageRequest) {
		return HttpResult.ok(inputService.findPage(pageRequest));
	}
	
    /**
     * 根据主键查询
     * @param id
     * @return
     */ 	
	@GetMapping(value="/findByID")
	@ResponseBody
	public HttpResult findById(@RequestParam Integer id) {
		return HttpResult.ok(inputService.findById(id));
	}

	@GetMapping(value="/findByCas")
	@ResponseBody
	public HttpResult findByCas(@RequestParam String cas) {
		return HttpResult.ok(inputService.findByCas(cas));
	}

	@GetMapping(value="/findAll")
	@ResponseBody
	public HttpResult findAll() {
		return HttpResult.ok(inputService.findAll());
	}


}
