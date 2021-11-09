package com.mangocms.mango.dao;

import com.mangocms.mango.pojo.Dept;

public interface DeptMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Dept record);

    int insertSelective(Dept record);

    Dept selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);
}