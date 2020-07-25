package com.kanouakira.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.kanouakira.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @Reference
    private TestService testService;

    @RequestMapping("/test")
    @ResponseBody
    public String testMsg(String msg){
        System.out.println(msg);
        return testService.sayTest(msg);
    }
}
