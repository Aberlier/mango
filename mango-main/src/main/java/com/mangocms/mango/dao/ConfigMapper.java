package com.mangocms.mango.dao;

import com.mangocms.mango.pojo.Config;

public interface ConfigMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Config record);

    int insertSelective(Config record);

    Config selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Config record);

    int updateByPrimaryKey(Config record);
}