package cn.nwafu.cet.service;

import cn.nwafu.cet.model.Parameter;
import cn.nwafu.cet.service.CurdService;

/**
 * ---------------------------
 *  (ParameterService)         
 * ---------------------------
 * 作者：  Johnny
 * 时间：  2020-10-08 15:14:13
 * 说明：
 * ---------------------------
 */
public interface ParameterService extends CurdService<Parameter> {
    Parameter findByCas(String cas);
}
