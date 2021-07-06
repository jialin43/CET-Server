package cn.nwafu.cet.model;

import lombok.Data;

/**
 * ---------------------------
 *  (Menu)         
 * ---------------------------
 * 作者：  Johnny
 * 时间：  2020-10-08 15:14:13
 * 说明：
 * ---------------------------
 */
@Data
public class Menu {

	/**
	 *
	 */
	private Integer id;
	/**
	 *
	 */
	private String children;
	/**
	 *
	 */
	private String icon;
	/**
	 *
	 */
	private String level;
	/**
	 *
	 */
	private String name;
	/**
	 *
	 */
	private Integer ordernum;
	/**
	 *
	 */
	private Integer parentid;
	/**
	 *
	 */
	private Integer type;
	/**
	 *
	 */
	private String url;
}