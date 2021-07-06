package cn.nwafu.cet.model;

import lombok.Data;

import java.util.Date;

/**
 * ---------------------------
 *  (Output)         
 * ---------------------------
 * 作者：  Johnny
 * 时间：  2020-10-08 151413
 * 说明：
 * ---------------------------
 */
@Data
public class Output {
	/**
	 *
	 */
	private int id;
	/**
	 *
	 */
	private String cas;
	private String lifeCycle;
	private String title;
	private String remark;

	private Double qchemical;
	private Double temission;
	private Double main;
	private Double fmain;
	private String emissionPattern;
	private String waste;
	private Double water;
	private Double air;
	private Double sludge;
	private Double abatementWater;
	private Double abatementAir;
	private Double abatementSludge;
	private String stponsite;
	private Double stponsiteWater;
	private Double stponsiteAir;
	private Double stponsiteSludge;
	private Double stponsiteDegrade;
	private String waterTo;
	private String publicStp;
	private Double stpWater;
	private Double stpAir;
	private Double stpSludge;
	private Double stpDegrade;
	private String appLsludge;
	private Double stpEffluent;
	private Double flow;
	private Double freg;
	private Double flocal;
	private Double fvariability;
	private Double fdirectwater;


	private Double elocalWater;
	private Double elocalDirectwater;
	private Double elocalAir;
	private Double elocalstpAir;
	private Double elocalSoil;
	private Double elocalstpSoil;
	private Double elocalstpWater;



	private Double pecstp;
	/**
	 *
	 */
	private Double peclocalWater;
	/**
	 *
	 */
	private Double peclocalSed;
	/**
	 *
	 */
	private Double peclocalSoil30;
	/**
	 *
	 */
	private Double peclocalGrw;
	/**
	 *
	 */
	private Double pecaquPredator;
	/**
	 *
	 */
	private Double pecterPredator;
	/**
	 *
	 */
	private Double addinh;
	/**
	 *
	 */
	private Double addoralWater;
	/**
	 *
	 */
	private Double addoralFood;
	/**
	 *
	 */
	private Double addt;

	private Double pecstpPnec;
	private Double pecstpRcr;
	private Double peclocalWaterPnec;
	private Double peclocalWaterRcr;
	private Double peclocalSedPnec;
	private Double peclocalSedRcr;
	private Double peclocalSoil30Pnec;
	private Double peclocalSoil30Rcr;
	private Double peclocalGrwPnec;
	private Double peclocalGrwRcr;
	private Double pecaquPredatorPnec;
	private Double pecaquPredatorRcr;
	private Double pecterPredatorPnec;
	private Double pecterPredatorRcr;
	private Double addinhDnel;
	private Double addinhRcr;
	private Double addoralWaterDnel;
	private Double addoralWaterRcr;
	private Double addoralFoodDnel;
	private Double addoralFoodRcr;
	private Double addtDnel;
	private Double addtRcr;
	private Date gmtCreate;
	private Date gmtModified;
	private String creator;
}