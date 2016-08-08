package com.sunsekey.user.controller;

import com.sunsekey.base.controller.BaseController;
import com.sunsekey.base.service.IBaseService;
import com.sunsekey.entity.User;
import com.sunsekey.user.service.IUserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/7/12.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController extends BaseController<User> {

    @Autowired
    private IUserService iUserService;

    @RequestMapping(value = "/save")
    public ModelAndView save(User user) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("user/afterSave");
        if(null == user.getId())
            iUserService.save(user);
        else{
            iUserService.update(user);
        }
        mv.addObject("msg", "save successfully");
        return mv;
    }

    @RequestMapping(value = "/userForm")
    public ModelAndView userForm(@RequestParam Integer id){
        ModelAndView mv = new ModelAndView();
        User user = iUserService.selectById(id);
        if(null != user){
            mv.addObject("user", user);
        }
        mv.setViewName("user/userForm");
        return mv;
    }

    @RequestMapping(value="/userList")
    public ModelAndView viewUserList(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("user/userList");
        mv.addObject("userList", iUserService.selectAll());
        return mv;
    }

    @Override
    public IBaseService<User> getIBaseService() {
        return iUserService;
    }
}
