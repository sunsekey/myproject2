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
    public ModelAndView save(User user) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("user/afterSave");
        /*iUserService.save(user);
        iUserService.getAndPrintUser(user.getId());*/
        iUserService.saveOpr(user);
        mv.addObject("msg", "save successfully");
        return mv;
    }

    @RequestMapping(value = "/userForm")
    public ModelAndView userForm(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("user/userForm");
        return mv;
    }

}
