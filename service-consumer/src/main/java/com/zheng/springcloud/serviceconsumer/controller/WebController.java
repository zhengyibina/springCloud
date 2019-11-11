package com.zheng.springcloud.serviceconsumer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@RequestMapping("/webC")
public class WebController {

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/hello")
    public String hello() {
        return restTemplate.getForEntity("http://localhost:8080/helloC/hello", String.class).getBody();
    }
}
