package com.mangocms.mango.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: mango
 * @description: 测试
 * @author: zjc
 * @create: 2020-07-18 09:27
 **/
@RestController
@RequestMapping("/")
public class HelloController {
    @GetMapping(value="/hello")
    public String hello(){
        return "HelloWorld";
    }
}
