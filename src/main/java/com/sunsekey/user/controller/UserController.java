package com.sunsekey.user.controller;

import com.sunsekey.user.entity.User;
import com.sunsekey.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2016/7/12.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private IUserService iUserService;

    @RequestMapping(value = "/save")
    public ModelAndView save() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("user/afterSave");
        User newUser = new User();
        newUser.setName("老王");
        newUser.setAccount("s001");
        newUser.setAge(29);
        newUser.setSex("001");
        newUser.setPassword("123456");
        iUserService.save(newUser);
        mv.addObject("msg", "save successfully");
        return mv;
    }
}
