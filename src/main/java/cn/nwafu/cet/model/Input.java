package cn.nwafu.cet.model;

import lombok.Data;

import java.util.Date;

/**
 * ---------------------------
 *  (Input)         
 * ---------------------------
 * 作者：  Johnny
 * 时间：  2020-10-08 15:14:13
 * 说明：
 * ---------------------------
 */
@Data
public class Input {

	/**
	 *
	 */
	private Integer id;

	private String cas;
	private String wzmc;
	private String fzs;
	private String mark;
	/**
	 *
	 */
	private Double molw;
	/**
	 *
	 */
	private Double vpTemptest;
	/**
	 *
	 */
	private Double solTemptest;
	/**
	 *
	 */
	private Double koc;
	/**
	 *
	 */
	private Double kow;
	/**
	 *
	 */
	private String biodeg;
	/**
	 *
	 */
	private Double bcfFish;
	/**
	 *
	 */
	private String khydrWater;
	/**
	 *
	 */
	private String solid;
	/**
	 *
	 */
	private Double tempmelt;
	/**
	 *
	 */
	private String sourceType;
	/**
	 *
	 */
	private Double temission;
	/**
	 *
	 */
	private Double elocalWater;
	/**
	 *
	 */
	private Double elocalAir;
	/**
	 *
	 */
	private Double elocalDirectwater;
	/**
	 *
	 */
	private Double pecreaAir;
	/**
	 *
	 */
	private Double pecregWater;
	/**
	 *
	 */
	private Double pecregSoil;
	private Double tempVptest;
	private  Double tempSoltest;
	private Date gmtCreate;
	private Date gmtModified;
	private String creator;
}