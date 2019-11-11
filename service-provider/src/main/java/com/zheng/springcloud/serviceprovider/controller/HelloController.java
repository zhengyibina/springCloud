package com.zheng.springcloud.serviceprovider.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloC")
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        return "hello!";
    }
}
