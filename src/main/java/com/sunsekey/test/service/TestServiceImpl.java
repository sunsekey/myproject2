package com.sunsekey.test.service;

import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/7/9.
 */
@Service
public class TestServiceImpl implements ITestService {

    public String hello(){
        return "Hello World From ServiceImpl";
    }
}
