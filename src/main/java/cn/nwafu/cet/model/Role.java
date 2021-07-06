package cn.nwafu.cet.model;

import lombok.Data;

import java.util.Date;

/**
 * ---------------------------
 *  (Role)         
 * ---------------------------
 * 作者：  Johnny
 * 时间：  2020-10-08 15:14:13
 * 说明：
 * ---------------------------
 */
@Data
public class Role {

	/**
	 *
	 */
	private Integer id;
	/**
	 *
	 */
	private String name;
	/**
	 *
	 */
	private String menus;
	private Date gmtCreate;
	private Date gmtModified;
	private String creator;
}