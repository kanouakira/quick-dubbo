package com.kanouakira.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.kanouakira.service.TestService;

@Service
public class TestServiceImpl implements TestService {
    @Override
    public String sayTest(String msg) {
        return "Massage:" + msg;
    }
}
