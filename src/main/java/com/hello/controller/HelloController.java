package com.hello.controller;

import com.hello.beans.HelloBean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value = "/hello")
    public HelloBean hello(){
        return new HelloBean();
    }

    @RequestMapping(value = "/hello/{name}")
    public HelloBean hello(@PathVariable("name") String name){
        return new HelloBean(name);
    }
}
