package com.mangocms.mango.serviceImpl;

import com.mangocms.mango.dao.UserMapper;
import com.mangocms.mango.pojo.User;
import com.mangocms.mango.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: mango
 * @description: 用户业务逻辑实现类
 * @author: zjc
 * @create: 2020-07-18 15:51
 **/
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
