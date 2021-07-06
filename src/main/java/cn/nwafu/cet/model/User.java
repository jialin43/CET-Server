package cn.nwafu.cet.model;

import lombok.Data;

import java.util.Date;

/**
 * ---------------------------
 *  (User)         
 * ---------------------------
 * 作者：  Johnny
 * 时间：  2020-10-08 15:14:13
 * 说明：
 * ---------------------------
 */
@Data
public class User {

	/**
	 *
	 */
	private int id;
	/**
	 *
	 */
	private String username;
	/**
	 *
	 */
	private String password;
	/**
	 *
	 */
	private String nickname;
	/**
	 *
	 */
	private String salt;
	/**
	 *
	 */
	private String role;
	/**
	 *
	 */
	private String career;

	private String mobile;
	/**
	 *
	 */
	private String email;
	/**
	 *
	 */
	private String company;
	private String department;
	/**
	 *
	 */
	private Date gmtCreate;
	/**
	 *
	 */
	private Date gmtModified;

	private String creator;
	private Integer status;

	private String filepath;   //存文件的地址
}