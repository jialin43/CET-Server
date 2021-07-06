package cn.nwafu.cet.model;

import lombok.Data;

import java.util.Date;

/**
 * ---------------------------
 *  (Parameter)         
 * ---------------------------
 * 作者：  Johnny
 * 时间：  2020-10-08 15:14:13
 * 说明：
 * ---------------------------
 */
@Data
public class Parameter {

	/**
	 *
	 */
	private Integer id;
	private String cas;
	/**
	 *
	 */
	private Double rhoSolid;
	/**
	 *
	 */
	private Double rhoWater;
	/**
	 *
	 */
	private Double rhoAir;
	/**
	 *
	 */
	private Double temp;
	/**
	 *
	 */
	private Double wind;
	/**
	 *
	 */
	private Double rainRate;
	/**
	 *
	 */
	private Double effluentStp;
	/**
	 *
	 */
	private Double capacityStp;
	/**
	 *
	 */
	private Double sewageFlow;
	/**
	 *
	 */
	private Double suspconcinf;
	/**
	 *
	 */
	private Double surplusSludge;
	/**
	 *
	 */
	private Double flow;
	/**
	 *
	 */
	private Double suspWater;
	/**
	 *
	 */
	private Double fsoildSusp;
	/**
	 *
	 */
	private Double fwaterSusp;
	/**
	 *
	 */
	private Double focSusp;
	/**
	 *
	 */
	private Double rhoSusp;
	/**
	 *
	 */
	private Double fsoildSed;
	/**
	 *
	 */
	private Double fwaterSed;
	/**
	 *
	 */
	private Double rhoSed;
	/**
	 *
	 */
	private Double focSed;
	/**
	 *
	 */
	private Double convSed;
	/**
	 *
	 */
	private Double rhoSoil;
	/**
	 *
	 */
	private Double fsolidSoil;
	/**
	 *
	 */
	private Double fwaterSoil;
	/**
	 *
	 */
	private Double fairSoil;
	/**
	 *
	 */
	private Double focSoil;
	/**
	 *
	 */
	private Double convSoil;
	/**
	 *
	 */
	private Double depthSoil;
	/**
	 *
	 */
	private Double applSludge;
	/**
	 *
	 */
	private Double rhoWorm;
	/**
	 *
	 */
	private Double fgutWorm;
	/**
	 *
	 */
	private Double irAir;
	/**
	 *
	 */
	private Double et;
	/**
	 *
	 */
	private Double ef;
	/**
	 *
	 */
	private Double ed;
	/**
	 *
	 */
	private Double bw;
	/**
	 *
	 */
	private Double at;
	/**
	 *
	 */
	private Double irFish;
	/**
	 *
	 */
	private Double irWater;
	/**
	 *
	 */
	private Double irS;
	private Date gmtCreate;
	private Date gmtModified;
	private String creator;
}