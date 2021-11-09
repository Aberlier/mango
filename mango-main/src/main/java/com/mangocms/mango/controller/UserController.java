package com.mangocms.mango.controller;

import com.mangocms.mango.pojo.User;
import com.mangocms.mango.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: mango
 * @description: 用户控制层
 * @author: zjc
 * @create: 2020-07-18 15:56
 **/
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping(value="/findAll")
    @ApiOperation(value = "查询所有用户",httpMethod ="GET", response = User.class,notes = "HelloWorld")
    public List<User> findAll(){
        return userService.findAll();
    }
}
