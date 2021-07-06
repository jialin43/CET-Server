package cn.nwafu.cet.service;

import cn.nwafu.cet.model.MailReset;

/**
 * ---------------------------
 *  (MailResetService)
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2020-12-29 09:45:55
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
public interface MailResetService extends CurdService<MailReset> {
    MailReset findByMail(String mail);

}
