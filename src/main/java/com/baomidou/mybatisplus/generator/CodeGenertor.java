package com.baomidou.mybatisplus.generator;

import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.run.AutoGenerator;

public class CodeGenertor {

	public static void main(String[] args) {
		
		AutoGenerator ag = new AutoGenerator();
		//设置名称
		GlobalConfig gc = new GlobalConfig();
		gc.setOutputDir("D:\\code");
		gc.setFileOverride(true);
		gc.setActiveRecord(false);
		gc.setEnableCache(false);
		gc.setBaseResultMap(true);
		gc.setBaseColumnList(true);
		gc.setAuthor("dongh");
		gc.setControllerName("%sController");
		gc.setMapperName("%sDao");
		gc.setServiceName("%sService");
		gc.setServiceImplName("%sServiceImpl");
		gc.setXmlName("%sMapper");
		gc.setKotlin(false);
		gc.setOpen(true);
		ag.setGlobalConfig(gc);
		//设置数据源
		DataSourceConfig dsc = new DataSourceConfig();
		dsc.setDbType(DbType.MYSQL);
		dsc.setDriverName("com.mysql.jdbc.Driver");
		dsc.setUsername("sglx");
		dsc.setPassword("hhh123");
		dsc.setUrl("jdbc:mysql://localhost:3306/d_process");
		ag.setDataSource(dsc);
		//设置超类
		StrategyConfig strategy = new StrategyConfig();
		//strategy.setTablePrefix("trace_");
		strategy.setNaming(NamingStrategy.underline_to_camel);
		strategy.setEntityBooleanColumnRemoveIsPrefix(false);
		//strategy.setInclude("trace_breed_drugs");
		strategy.setSuperMapperClass("com.ren.cloud.data.dao.BaseDao");
		strategy.setSuperControllerClass(null);
		strategy.setSuperServiceClass("com.ren.cloud..data.service.BaseService");
		strategy.setSuperServiceImplClass("com.ren.cloud.data.service.BaseServiceImpl");
		strategy.setSuperEntityClass(null);
		strategy.setEntityLombokModel(true);
		ag.setStrategy(strategy);
		//设置包信息
		PackageConfig pc = new PackageConfig();
		pc.setParent("com.ren.cloud.process");
		pc.setController("controller");
		pc.setEntity("entity");
		pc.setMapper("dao");
		pc.setService("service");
		pc.setServiceImpl("service.impl");
		pc.setXml("mapper");
		ag.setPackageInfo(pc);
		
		ag.execute();
		
	}

}
