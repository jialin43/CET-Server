/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : cetdemo

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2020-12-17 22:40:21
*/
DROP DATABASE `cetdemo`;
CREATE DATABASE `cetdemo` DEFAULT CHARACTER SET utf8;
USE `cetdemo`;
SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for density
-- ----------------------------
DROP TABLE IF EXISTS `density`;
CREATE TABLE `density` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cas` varchar(255) DEFAULT '',
  `solid` varchar(10) DEFAULT '1',
  `qchemical` double(255,0) DEFAULT NULL,
  `molw` double DEFAULT NULL,
  `vp_temptest` double DEFAULT NULL,
  `temp_vptest` double DEFAULT 25,
  `vp` double DEFAULT NULL,
  `sol_temp_test` double DEFAULT NULL,
  `temp_soltest` double DEFAULT 25,
  `sol` double DEFAULT NULL,
  `koc` double DEFAULT NULL,
  `kow` double DEFAULT NULL,
  `biodeg` varchar(255) DEFAULT NULL,
  `tempmelt` double DEFAULT 43,
  `vpl` double DEFAULT NULL,
  `conjunge` double DEFAULT NULL,
  `surf_aer` double DEFAULT NULL,
  `henry` double DEFAULT NULL,
  `kair_water` double DEFAULT NULL,
  `fass_aer` double DEFAULT NULL,
  `kp_soil` double DEFAULT NULL,
  `kp_susp` double DEFAULT NULL,
  `kp_sed` double DEFAULT NULL,
  `ksoil_water` double DEFAULT NULL,
  `ksusp_water` double DEFAULT NULL,
  `ksed_water` double DEFAULT NULL,
  `bmf1` double DEFAULT NULL,
  `bmf2` double DEFAULT NULL,
  `bcf_worm` double DEFAULT null,
  `khydr_water` double DEFAULT 0,
  `kbio_stp` double DEFAULT 1,
  `kdeg_stp` double DEFAULT NULL,
  `kdeg_stp2` double DEFAULT NULL,
  `kdeg_air` double DEFAULT 0,
  `kphoto_water` double DEFAULT 0,
  `kbio_sed` double DEFAULT 0,
  `kbio_fresh` double DEFAULT NULL,
  `kbio_soil` double DEFAULT NULL,
  `bcf_fish` double DEFAULT NULL,
  `source_type` varchar(255) DEFAULT NULL,
  `elocal_water` double DEFAULT NULL,
  `elocal_air` double DEFAULT NULL,
  `elocal_directwater` double DEFAULT NULL,
  `temission` double DEFAULT NULL,
  `femisssion_water` double DEFAULT NULL,
  `femisssion_air` double DEFAULT NULL,
  `femisssion_soil` double DEFAULT NULL,
  `fmainsource` double DEFAULT NULL,
  `fabatement_water` double DEFAULT NULL,
  `fabatement_air` double DEFAULT NULL,
  `elocal_soil` double DEFAULT NULL,
  `fabatement_soil` double DEFAULT NULL,
  `fstp_water` double DEFAULT NULL,
  `fstp_air` double DEFAULT NULL,
  `fstp_sludge` double DEFAULT NULL,
  `fstp_degrade` double DEFAULT NULL,
  `fstp_total` double DEFAULT NULL,
  `fstp_water2` double DEFAULT NULL,
  `fstp_air2` double DEFAULT NULL,
  `fstp_sludge2` double DEFAULT NULL,
  `fstp_degrade2` double DEFAULT NULL,
  `fstp_total2` double DEFAULT NULL,
  `elocalstp_water` double DEFAULT NULL,
  `elocalstp_air` double DEFAULT NULL,
  `csludge` double DEFAULT NULL,
  `sludgerate` double DEFAULT NULL,
  `clocal_water` double DEFAULT NULL,
  `clocal_directwater` double DEFAULT NULL,
  `deptotal` double DEFAULT NULL,
  `depstd_aer` double DEFAULT NULL,
  `depstd_gas` double DEFAULT NULL,
  `deptotal_ann` double DEFAULT NULL,
  `dair` double DEFAULT NULL,
  `cstd_air` double DEFAULT NULL,
  `peclocal_air_ann` double DEFAULT NULL,
  `k_soil` double DEFAULT NULL,
  `kvolat` double DEFAULT NULL,
  `kasl_air` double DEFAULT NULL,
  `kasl_soil` double DEFAULT NULL,
  `corr_volat_s` double DEFAULT NULL,
  `kleach` double DEFAULT NULL,
  `finf_soil` double DEFAULT NULL,
  `veff_s1r` double DEFAULT NULL,
  `deff_s1r` double DEFAULT NULL,
  `dp` double DEFAULT NULL,
  `csoil_ten_0` double DEFAULT NULL,
  `csoil_five_0` double DEFAULT NULL,
  `cdep_soil_ten_0` double DEFAULT NULL,
  `cdep_soil_five_0` double DEFAULT NULL,
  `csludge_soil_one_0` double DEFAULT NULL,
  `csludge_soil_ten_0` double DEFAULT NULL,
  `csludge_soil_five_0` double DEFAULT NULL,
  `facc` double DEFAULT NULL,
  `clocal_soil_30` double DEFAULT NULL,
  `clocal_soil_180` double DEFAULT NULL,
  `tav_soil` double DEFAULT NULL,
  `peclocal_soil_porew` double DEFAULT NULL,
  `cfish` double DEFAULT NULL,
  `pecaqu_predator` double DEFAULT 2,
  `pecaqu_toppredator` double DEFAULT NULL,
  `pecter_predator` double DEFAULT NULL,
  `pecreg_air` double DEFAULT NULL,
  `pecreg_water` double DEFAULT NULL,
  `pecreg_soil` double DEFAULT NULL,
  `pecreg_soil_porew` double DEFAULT NULL,
  `pecstp` double DEFAULT 2,
  `peclocal_water` double DEFAULT 2,
  `peclocal_water_ann` double DEFAULT NULL,
  `peclocal_sed` double DEFAULT 2,
  `peclocal_soil_30` double DEFAULT 2,
  `peclocal_soil_180` double DEFAULT NULL,
  `peclocal_grw` double DEFAULT 2,
  `f_pur` double DEFAULT NULL,
  `pec_drwl` double DEFAULT NULL,
  `addinh` double DEFAULT 2,
  `addoral_soil` double DEFAULT NULL,
  `addoral_fish` double DEFAULT 2,
  `addoral_water` double DEFAULT 2,
  `addt` double DEFAULT 2,
  `pecstp_pnec` double DEFAULT 2,
  `peclocal_water_pnec` double DEFAULT 2,
  `peclocal_sed_pnec` double DEFAULT 2,
  `peclocal_soil_30_pnec` double DEFAULT 2,
  `peclocal_grw_pnec` double DEFAULT 2,
  `pecaqu_predator_pnec` double DEFAULT 2,
  `pecter_predator_pnec` double DEFAULT 2,
  `addinh_dnel` double DEFAULT 2,
  `addoral_water_dnel` double DEFAULT 2,
  `addoral_food_dnel` double DEFAULT 2,
  `addt_dnel` double DEFAULT 2,
    `creator` varchar(255) DEFAULT NULL,
`gmt_create` datetime DEFAULT NULL,
  `gmt_modified` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of density
-- ----------------------------
-- INSERT INTO `density` VALUES ('1', '12321', '1', '0', '92', '3089', '21.1', '1385.135', '587', '25', '473.9451', '205', '537', '1', '-25.2', '595', '0.01', '0.01', '268.8785', '0.11428', '0.0000000722', '4', '21', '10.25', '6.37286', '6.025', '5.925', '1', '1', '7.284382', '0', '1', '1', '0', '0', '0', '1e-20', '0.023105', '41.73496', '0', '0', '0', '0', '20', '100', '100', '100', '1', '0', '0', '16500', '0', '0.043', '0.000', '0.004', '0.951', '1', '95.11349', '545', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0.027', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0.5', '0', '0', '0', '0', '0', '0', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2','admin',null,null);

-- ----------------------------
-- Table structure for input
-- ----------------------------
DROP TABLE IF EXISTS `input`;
CREATE TABLE `input` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cas` varchar(255) DEFAULT NULL,
  `wzmc` varchar(255) DEFAULT NULL,
  `mark` varchar(255) DEFAULT NULL,
  `fzs` varchar(255) DEFAULT NULL,
  `molw` double DEFAULT NULL,
  `vp_temptest` double DEFAULT 3089,
  `sol_temptest` double DEFAULT NULL,
  `koc` double(255,0) DEFAULT NULL,
  `kow` double DEFAULT NULL,
  `biodeg` varchar(255) DEFAULT NULL,
  `bcf_fish` double(255,0) DEFAULT NULL,
  `khydr_water` varchar(255) DEFAULT NULL,
  `solid` varchar(10) DEFAULT '',
  `tempmelt` double DEFAULT NULL,
  `source_type` varchar(255) DEFAULT NULL,
  `temission` double DEFAULT NULL,
  `elocal_water` double DEFAULT NULL,
  `elocal_air` double DEFAULT NULL,
  `elocal_directwater` double DEFAULT NULL,
  `pecrea_air` double(255,0) DEFAULT NULL,
  `pecreg_water` double DEFAULT NULL,
  `pecreg_soil` double DEFAULT NULL,
  `creator` varchar(255) DEFAULT NULL,
  `gmt_create` datetime DEFAULT NULL,
  `gmt_modified` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of input
-- ----------------------------
INSERT INTO `input` VALUES ('1', '12321', '某物质', '某物质的备注', 'c3h2oh', '92', '3089', '587', '205', '537.0317964', '快速生物降解', '42', '0', '0', '-25.2', '工业源', '20', '9.99', '8.33', '0', null, null, null,'admin', null, null);

-- ----------------------------
-- Table structure for menu
-- ----------------------------
DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `children` varchar(255) DEFAULT NULL,
  `icon` varchar(255) DEFAULT NULL,
  `level` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `orderNum` int(11) DEFAULT NULL,
  `parentId` int(11) DEFAULT NULL,
  `type` int(11) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of menu
-- ----------------------------
INSERT INTO `menu` VALUES ('2', null, 'el-icon-document', '0', '物质及默认参数', '0', '0', '0', '/element/element');
INSERT INTO `menu` VALUES ('3', null, 'el-icon-s-data', '0', '暴露场景添加', '0', '0', '0', '/evaluate/scenes');
INSERT INTO `menu` VALUES ('4', null, 'el-icon-user-solid', '0', '暴露估算结果', '0', '0', '0', '/evaluate/results');
INSERT INTO `menu` VALUES ('5', '', 'el-icon-document-add', '0', '输出报告', '0', '0', '0', '/evaluate/report');
INSERT INTO `menu` VALUES ('6', null, 'el-icon-document-checked', '0', '用户管理', '0', '0', '1', '/sys/user');
INSERT INTO `menu` VALUES ('7', null, 'el-icon-help', '0', '使用帮助', '0', '0', '0', '/sys/help');

-- ----------------------------
-- Table structure for output
-- ----------------------------
DROP TABLE IF EXISTS `output`;
CREATE TABLE `output` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `cas` varchar(255) DEFAULT '',
  `life_cycle` varchar(255) DEFAULT '',
  `title` varchar(255) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `qchemical` double(20,10) DEFAULT NULL,
  `temission` double(20,10) DEFAULT NULL,
  `main` double(20,10) DEFAULT 1.0000000000,
  `fmain` double(20,10) DEFAULT 0.1000000000,
  `emission_pattern` varchar(255) CHARACTER SET utf8 DEFAULT '2',
  `waste` double(20,10) DEFAULT NULL,
  `water` double(20,10) unsigned zerofill DEFAULT NULL,
  `air` double(20,10) unsigned zerofill DEFAULT NULL,
  `sludge` double(20,10) DEFAULT NULL,
  `abatement_water` double(20,10) DEFAULT NULL,
  `abatement_air` double(20,10) DEFAULT NULL,
  `abatement_sludge` double(20,10) DEFAULT NULL,
  `stponsite` varchar(255) DEFAULT NULL,
  `stponsite_water` double(20,10) DEFAULT NULL,
  `stponsite_air` double(20,10) DEFAULT NULL,
  `stponsite_sludge` double(20,10) DEFAULT NULL,
  `stponsite_degrade` double(20,0) DEFAULT NULL,
  `water_to` varchar(255) DEFAULT NULL,
  `public_stp` varchar(255) DEFAULT '',
  `stp_water` double(20,10) DEFAULT NULL,
  `stp_air` double(20,10) DEFAULT NULL,
  `stp_sludge` double(20,10) DEFAULT NULL,
  `stp_degrade` double(20,10) DEFAULT NULL,
  `app_lsludge` varchar(255) DEFAULT NULL,
  `stp_effluent` double(20,10) DEFAULT 2000.0000000000,
  `flow` double(20,10) DEFAULT 18000.0000000000,
  `freg` double(20,10) DEFAULT 0.1000000000,
  `flocal` double(20,10) DEFAULT 0.0005000000,
  `fvariability` double(20,10) DEFAULT 4.0000000000,
  `fdirectwater` double(20,10) DEFAULT 0.5000000000,
  `elocal_water` double(20,10) DEFAULT NULL,
  `elocal_directwater` double(20,10) DEFAULT NULL,
  `elocal_air` double(20,10) DEFAULT NULL,
  `elocalstp_soil` double(20,10) DEFAULT NULL,
  `elocalstp_air` double(20,10) DEFAULT NULL,
  `elocal_soil` double(20,10) DEFAULT NULL,
  `elocalstp_water` double(20,10) DEFAULT NULL,
  `pecstp` double DEFAULT NULL,
  `peclocal_water` double DEFAULT NULL,
  `peclocal_sed` double DEFAULT NULL,
  `peclocal_soil_30` double DEFAULT NULL,
  `peclocal_grw` double DEFAULT NULL,
  `pecaqu_predator` double DEFAULT NULL,
  `pecter_predator` double DEFAULT NULL,
  `addinh` double DEFAULT NULL,
  `addoral_water` double DEFAULT NULL,
  `addoral_food` double DEFAULT NULL,
  `addt` double DEFAULT NULL,
  `pecstp_pnec` double DEFAULT NULL,
  `pecstp_rcr` double DEFAULT NULL,
  `peclocal_water_pnec` double DEFAULT NULL,
  `peclocal_water_rcr` double DEFAULT NULL,
  `peclocal_sed_pnec` double DEFAULT NULL,
  `peclocal_sed_rcr` double DEFAULT NULL,
  `peclocal_soil_30_pnec` double DEFAULT NULL,
  `peclocal_soil_30_rcr` double DEFAULT NULL,
  `peclocal_grw_pnec` double DEFAULT NULL,
  `peclocal_grw_rcr` double DEFAULT NULL,
  `pecaqu_predator_pnec` double DEFAULT NULL,
  `pecaqu_predator_rcr` double DEFAULT NULL,
  `pecter_predator_pnec` double DEFAULT NULL,
  `pecter_predator_rcr` double DEFAULT NULL,
  `addinh_dnel` double DEFAULT NULL,
  `addinh_rcr` double DEFAULT NULL,
  `addoral_water_dnel` double DEFAULT NULL,
  `addoral_water_rcr` double DEFAULT NULL,
  `addoral_food_dnel` double DEFAULT NULL,
  `addoral_food_rcr` double DEFAULT NULL,
  `addt_dnel` double DEFAULT NULL,
  `addt_rcr` double DEFAULT NULL,
  `creator` varchar(255) DEFAULT NULL,
  `gmt_create` datetime DEFAULT NULL,
  `gmt_modified` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=213 DEFAULT CHARSET=utf8mb4;
-- ----------------------------
-- Records of output
-- ----------------------------

-- ----------------------------
-- Table structure for parameter
-- ----------------------------
DROP TABLE IF EXISTS `parameter`;
CREATE TABLE `parameter` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cas` varchar(255) DEFAULT '',
  `rho_solid` double DEFAULT 2500,
  `rho_water` double DEFAULT 1000,
  `rho_air` double DEFAULT 1.3,
  `temp` double DEFAULT 10,
  `wind` double DEFAULT 2,
  `rain_rate` double DEFAULT 674,
  `effluent_stp` double DEFAULT 2000,
  `capacity_stp` double DEFAULT 13793,
  `sewage_flow` double DEFAULT 0.145,
  `suspconcinf` double DEFAULT 0.2,
  `surplus_sludge` double DEFAULT 232,
  `flow` double DEFAULT 18000,
  `susp_water` double DEFAULT 15,
  `fsoild_susp` double DEFAULT 0.1,
  `fwater_susp` double DEFAULT 0.9,
  `foc_susp` double DEFAULT 0.1,
  `rho_susp` double DEFAULT 1150,
  `fsoild_sed` double DEFAULT 0.2,
  `fwater_sed` double DEFAULT 0.8,
  `rho_sed` double DEFAULT 1300,
  `foc_sed` double DEFAULT 0.05,
  `conv_sed` double DEFAULT 2.6,
  `rho_soil` double DEFAULT 1700.26,
  `fsolid_soil` double DEFAULT 0.6,
  `fwater_soil` double DEFAULT 0.2,
  `fair_soil` double DEFAULT 0.2,
  `foc_soil` double DEFAULT 0.02,
  `conv_soil` double DEFAULT 1.13,
  `depth_soil` double DEFAULT 0.2,
  `appl_sludge` double DEFAULT 0.75,
  `rho_worm` double DEFAULT 1,
  `fgut_worm` double DEFAULT 0.1,
  `ir_air` double DEFAULT 0.65,
  `et` double DEFAULT 24,
  `ef` double DEFAULT 365,
  `ed` double DEFAULT 70,
  `bw` double DEFAULT 60.6,
  `at` double DEFAULT 25550,
  `ir_fish` double DEFAULT 30,
  `ir_water` double DEFAULT 1.85,
  `ir_s` double DEFAULT 50,
    `creator` varchar(255) DEFAULT NULL,
  `gmt_create` datetime DEFAULT NULL,
  `gmt_modified` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of parameter
-- ----------------------------
INSERT INTO `parameter` VALUES ('1', '12321', '2500', '1000', '1.3', '10', '2', '674', '2000', '13793', '0.145', '0.2', '232', '18000', '15', '0.1', '0.9', '0.1', '1150', '0.2', '0.8', '1300', '0.05', '2.6', '1700.26', '0.6', '0.2', '0.2', '0.02', '1.13', '0.2', '0.75', '1', '0.1', '0.65', '24', '365', '70', '60.6', '25550', '30', '1.85', '50','admin',NULL,NULL);

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `menus` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', '管理员', '1,2,3,4,5');
INSERT INTO `role` VALUES ('2', '普通用户', '1,2');
INSERT INTO `role` VALUES ('3', '游客', '1');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `nickname` varchar(255) DEFAULT NULL,
  `salt` varchar(255) DEFAULT '',
  `role` varchar(255) DEFAULT 1,
  `career` varchar(255) DEFAULT NULL,
  `mobile` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `company` varchar(255) DEFAULT NULL,
  `department` varchar(255) DEFAULT NULL,
   `filepath` varchar(255) DEFAULT NULL,
  `gmt_create` datetime DEFAULT NULL,
  `gmt_modified` datetime DEFAULT NULL,
  `status` int(11) DEFAULT 0,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;
INSERT INTO `user` VALUES ('1', 'admin', 'bd1718f058d8a02468134432b8656a86', '管理员', 'YzcmCZNvbXocrsz9dm8e', '2', 'CEO', '13612345678', 'zhoulj@nies.org','腾讯', '研发','G:/cet','2020-10-14', '2020-10-14',1);
INSERT INTO `user` VALUES ('3', 'zjjbjs', 'f79344151f809e53750e6dfa358dcf36', 'zhoulinjun', '17c7ce8b979647a28f49', '1', 'ooo', '15312037722', 'zhoulj2@nies.org', '化学品中心','研发', 'G:/cet', '2020-12-29 22:04:27', '2020-12-29 22:04:27', 1);

-- ----------------------------
-- Records of user
-- ----------------------------
DROP TABLE IF EXISTS `mailreset`;
CREATE TABLE `mailreset`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `expire_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 0 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;