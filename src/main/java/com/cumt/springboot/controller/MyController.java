package com.cumt.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: controller
 * @author: liuxiaosong
 * @Date: 2020/5/8
 * @version: 1.0
 */
@RestController
public class MyController {

    @GetMapping("/")
//    @ResponseBody
//    @RequestMapping("/")
    public String hello(){
        return "hello world";
    }
}
