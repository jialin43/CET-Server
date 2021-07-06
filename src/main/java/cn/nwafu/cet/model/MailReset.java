package cn.nwafu.cet.model;

import lombok.Data;

import java.util.Date;

/**
 * ---------------------------
 *  (MailReset)
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2020-12-29 09:45:55
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@Data
public class MailReset {

	/**  */
	private Integer id;
	/**  */
	private String email;
	/**  */
	private String sid;
	/**  */
	private Date expireTime;
	private String creator;
	private Date gmtCreate;


}