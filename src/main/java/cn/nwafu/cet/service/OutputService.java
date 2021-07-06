package cn.nwafu.cet.service;

import cn.nwafu.cet.model.Output;
import cn.nwafu.cet.service.CurdService;

import java.util.List;

/**
 * ---------------------------
 *  (OutputService)         
 * ---------------------------
 * 作者：  Johnny
 * 时间：  2020-10-08 15:14:13
 * 说明：
 * ---------------------------
 */
public interface OutputService extends CurdService<Output> {

    List<Output> findByCasAndCreator(String cas);
    int update(Output record);

}
