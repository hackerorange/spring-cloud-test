package com.glodon.springcloudribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("")
    public String test(){
        return  restTemplate.getForObject("http://USER/", String.class);
    }

}
