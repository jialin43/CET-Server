package cn.nwafu.cet.service;

import cn.nwafu.cet.model.Input;
import cn.nwafu.cet.service.CurdService;
import io.swagger.models.auth.In;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * ---------------------------
 *  (InputService)         
 * ---------------------------
 * 作者：  Johnny
 * 时间：  2020-10-08 15:14:13
 * 说明：
 * ---------------------------
 */
public interface InputService extends CurdService<Input> {
    List<Input> findAll();
    Input findByCas(String cas);
    @Transactional
    void saveAs(String cas,Input input);
}
