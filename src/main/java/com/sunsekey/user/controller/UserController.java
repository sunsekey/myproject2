package com.sunsekey.user.controller;

import com.sunsekey.user.entity.User;
import com.sunsekey.user.service.IUserService;
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
public class UserController {

    @Autowired
    private IUserService iUserService;

    @RequestMapping(value = "/save")
    public ModelAndView save(User user) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("user/afterSave");
        if(user.getId() == 0)
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

    @RequestMapping(value="/delete")
    @ResponseBody
    public Map<String,Object> delete(Integer id) {
        Map<String, Object> map = new HashMap<String, Object>();
        boolean flag = iUserService.delete(id);
        map.put("success", flag);
        return map;
    }

}
