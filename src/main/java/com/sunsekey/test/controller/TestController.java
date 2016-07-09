package com.sunsekey.test.controller;

import com.sunsekey.test.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2016/7/6.
 */
@org.springframework.stereotype.Controller
@RequestMapping(value = "/test")
public class TestController{

    @Autowired
    ITestService iTestService;
    @RequestMapping(value="/hello")
    public ModelAndView hello(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello");
        mv.addObject("msg",iTestService.hello());
        return mv;
    }
}
