package com.mangocms.mango.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

/**
 * @program: mango
 * @description: mybatis配置
 * @author: zjc
 * @create: 2020-07-18 10:40
 **/
//@Configuration
//@MapperScan("com.mangocms.mango.**.dao")
//public class MyBatisConfig {
//    @Autowired
//    private DataSource dataSource;
//
//    @Bean
//    public SqlSessionFactory sqlFactory() throws Exception{
//        //扫描model
//        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
//        sessionFactory.setDataSource(dataSource);
//        sessionFactory.setTypeAliasesPackage("com.mangocms.mango.**.pojo");
//        //扫描.xml文件
//        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//        sessionFactory.setMapperLocations(resolver.getResources("classpath*:**/mapper/*.xml"));
//        //classpath:**/*.xml
//
//        return sessionFactory.getObject();
//    }
//}
