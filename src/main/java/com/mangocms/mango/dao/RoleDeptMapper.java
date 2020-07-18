package com.mangocms.mango.dao;

import com.mangocms.mango.pojo.RoleDept;

public interface RoleDeptMapper {
    int deleteByPrimaryKey(Long id);

    int insert(RoleDept record);

    int insertSelective(RoleDept record);

    RoleDept selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RoleDept record);

    int updateByPrimaryKey(RoleDept record);
}