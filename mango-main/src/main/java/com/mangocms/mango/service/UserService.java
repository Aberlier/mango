package com.mangocms.mango.service;

import com.mangocms.mango.pojo.User;

import java.util.List;

/**
 * @program: mango
 * @description: 业务逻辑层
 * @author: zjc
 * @create: 2020-07-18 15:34
 **/

public interface UserService {
    /**
     * 查询所有用户信息
     * @return
     */
    List<User> findAll();
}

