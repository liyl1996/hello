package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 */
@RestController
@RequestMapping
public class GetMsgController {

    @RequestMapping("test")
    public String getMsg(){
        return "hello world";
    }
}
