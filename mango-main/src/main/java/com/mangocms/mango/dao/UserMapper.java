package com.mangocms.mango.dao;

import com.mangocms.mango.pojo.User;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    //查询所有用户信息
    List<User> findAll();

}