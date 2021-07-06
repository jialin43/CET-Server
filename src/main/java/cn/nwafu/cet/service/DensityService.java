package cn.nwafu.cet.service;

import cn.nwafu.cet.model.Density;

/**
 * ---------------------------
 *  (DensityService)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2020-10-08 16:05:25
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
public interface DensityService extends CurdService<Density> {
    Density findByCas(String cas);
}
