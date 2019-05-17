package com.cskaoyan.configration;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * Created by little Stone
 * Date 2019/5/15 Time 11:39
 */
@Configuration
@ComponentScan(basePackages = "com.cskaoyan",
		excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class,EnableWebMvc.class})})
public class SpringConfig {
	/*sqlsessionfactroybean*/
	@Bean("sqlSessionFactoryBean")
	public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource){
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setTypeAliasesPackage("com.cskaoyan.bean");
		sqlSessionFactoryBean.setDataSource(dataSource);
		return sqlSessionFactoryBean;
	}
	/*datasource*/
	@Bean
	public DataSource dataSource() throws PropertyVetoException {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
		dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/j13_jdbc_template?serverTimezone=GMT");
		dataSource.setUser("root");
		dataSource.setPassword("123456");
		return dataSource;
	}
	/*mapperScannerconfiguer*/
	@Bean
	public MapperScannerConfigurer mapperScannerConfigurer(){
		MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
		mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactoryBean");
		mapperScannerConfigurer.setBasePackage("com.cskaoyan.mapper");
		return mapperScannerConfigurer;
	}
}
