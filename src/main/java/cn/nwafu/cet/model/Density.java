package cn.nwafu.cet.model;

import lombok.Data;

import java.util.Date;

/**
 * ---------------------------
 *  (Density)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2020-10-08 16:05:25
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@Data
public class Density {

	/**
	 *
	 */
	private Integer id;
	private String cas;
	/**
	 *
	 */
	private String solid;
	/**
	 *
	 */
	private Double qchemical;
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
	private Double tempVptest;
	/**
	 *
	 */
	private Double vp;
	/**
	 *
	 */
	private Double solTempTest;
	/**
	 *
	 */
	private Double tempSoltest;
	/**
	 *
	 */
	private Double sol;
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
	private Double tempmelt;
	/**
	 *
	 */
	private Double vpl;
	/**
	 *
	 */
	private Double conjunge;
	/**
	 *
	 */
	private Double surfAer;
	/**
	 *
	 */
	private Double henry;
	/**
	 *
	 */
	private Double kairWater;
	/**
	 *
	 */
	private Double fassAer;
	/**
	 *
	 */
	private Double kpSoil;
	/**
	 *
	 */
	private Double kpSusp;
	/**
	 *
	 */
	private Double kpSed;
	/**
	 *
	 */
	private Double ksoilWater;
	/**
	 *
	 */
	private Double ksuspWater;
	/**
	 *
	 */
	private Double ksedWater;
	/**
	 *
	 */
	private Double bmf1;
	private Double bmf2;
	private Double bcfWorm;
	private Double khydrWater;
	private Double kbioStp;
	private Double kdegStp;
	private Double kdegStp2;
//	20201203 新增三个属性
	private Double kdegAir;
	private Double kphotoWater;
	private Double kbioSed;

	private Double kbioFresh;
	private Double kbioSoil;
	private Double bcfFish;


	/**
	 *
	 */
	private String sourceType;
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
	private Double temission;
	/**
	 *
	 */
	private Double femisssionWater;
	/**
	 *
	 */
	private Double femisssionAir;
	/**
	 *
	 */
	private Double femisssionSoil;
	/**
	 *
	 */
	private Double fmainsource;
	/**
	 *
	 */
	private Double fabatementWater;
	/**
	 *
	 */
	private Double fabatementAir;
	/**
	 *
	 */
	private Double elocalSoil;
	/**
	 *
	 */
	private Double fabatementSoil;
	/**
	 *
	 */
	private Double fstpWater;
	/**
	 *
	 */
	private Double fstpAir;
	/**
	 *
	 */
	private Double fstpSludge;
	private Double fstpDegrade;
	private Double fstpTotal;

	private Double fstpWater2;
	/**
	 *
	 */
	private Double fstpAir2;
	/**
	 *
	 */
	private Double fstpSludge2;
	private Double fstpDegrade2;
	private Double fstpTotal2;
	/**
	 *
	 */
	private Double elocalstpWater;
	/**
	 *
	 */
	private Double elocalstpAir;
	/**
	 *
	 */
	private Double csludge;
	/**
	 *
	 */
	private Double sludgerate;
	/**
	 *
	 */
	private Double clocalWater;
	/**
	 *
	 */
	private Double clocalDirectwater;
	/**
	 *
	 */
	private Double deptotal;
	/**
	 *
	 */
	private Double depstdAer;
	/**
	 *
	 */
	private Double depstdGas;
	/**
	 *
	 */
	private Double deptotalAnn;
	/**
	 *
	 */
	private Double dair;
	/**
	 *
	 */
	private Double cstdAir;
	/**
	 *
	 */
	private Double peclocalAirAnn;
	/**
	 *
	 */
	private Double kSoil;
	/**
	 *
	 */
	private Double kvolat;
	/**
	 *
	 */
	private Double kaslAir;
	/**
	 *
	 */
	private Double kaslSoil;
	/**
	 *
	 */
	private Double corrVolatS;
	/**
	 *
	 */
	private Double kleach;
	/**
	 *
	 */
	private Double finfSoil;
	/**
	 *
	 */
	private Double veffS1r;
	/**
	 *
	 */
	private Double deffS1r;
	/**
	 *
	 */
	private Double dp;
	/**
	 *
	 */
	private Double csoilTen0;
	/**
	 *
	 */
	private Double csoilFive0;
	/**
	 *
	 */
	private Double cdepSoilTen0;
	/**
	 *
	 */
	private Double cdepSoilFive0;
	/**
	 *
	 */
	private Double csludgeSoilOne0;
	/**
	 *
	 */
	private Double csludgeSoilTen0;
	/**
	 *
	 */
	private Double csludgeSoilFive0;
	/**
	 *
	 */
	private Double facc;
	/**
	 *
	 */
	private Double clocalSoil30;
	/**
	 *
	 */
	private Double clocalSoil180;
	/**
	 *
	 */
	private Double tavSoil;
	/**
	 *
	 */
	private Double peclocalSoilPorew;
	/**
	 *
	 */
	private Double cfish;
	/**
	 *
	 */
	private Double pecaquPredator;
	/**
	 *
	 */
	private Double pecaquToppredator;
	/**
	 *
	 */
	private Double pecterPredator;
	/**
	 *
	 */
	private Double pecregAir;
	/**
	 *
	 */
	private Double pecregWater;
	/**
	 *
	 */
	private Double pecregSoil;
	/**
	 *
	 */
	private Double pecregSoilPorew;
	/**
	 *
	 */
	private Double pecstp;
	/**
	 *
	 */
	private Double peclocalWater;
	/**
	 *
	 */
	private Double peclocalWaterAnn;
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
	private Double peclocalSoil180;
	/**
	 *
	 */
	private Double peclocalGrw;
	/**
	 *
	 */
	private Double fPur;
	/**
	 *
	 */
	private Double pecDrwl;
	/**
	 *
	 */
	private Double addinh;
	/**
	 *
	 */
	private Double addoralSoil;
	/**
	 *
	 */
	private Double addoralFish;
	/**
	 *
	 */
	private Double addoralWater;
	/**
	 *
	 */
	private Double addt;
	//风险评估相关
	private Double pecstpPnec;
	private Double 	peclocalWaterPnec;
	private Double peclocalSedPnec;
	private Double 	peclocalSoil30Pnec;
	private Double peclocalGrwPnec;
	private Double 	pecaquPredatorPnec;
	private Double  pecterPredatorPnec;
	private Double addinhDnel;
	private Double 	addoralWaterDnel;
	private Double addoralFoodDnel;
	private Double 	addtDnel;
	private Date gmtCreate;
	private Date gmtModified;
	private String creator;
}