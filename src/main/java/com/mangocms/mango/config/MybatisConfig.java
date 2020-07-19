package com.mangocms.mango.config;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @program: mango
 * @description:
 * @author: zjc
 * @create: 2020-07-19 10:41
 **/
//public class MybatisConfig {
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
