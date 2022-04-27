package com.atguigu.boot.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return  "hello spring boot 2";
    }

    @RequestMapping("/gitTest")
    public String gitTest(){
        String s="pull test!";
        return "hello geiTest";
    }
}
