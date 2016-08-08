package com.sunsekey.person.controller;

import com.sunsekey.base.controller.BaseController;
import com.sunsekey.base.service.IBaseService;
import com.sunsekey.entity.Person;
import com.sunsekey.person.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2016/8/7.
 */
@Controller
@RequestMapping(value = "/person")
public class PersonController extends BaseController<Person> {
    @Autowired
    private IPersonService iPersonService;
    @Override
    public IBaseService<Person> getIBaseService() {
        return iPersonService;
    }
    @RequestMapping(value = "/save")
    public ModelAndView save(Person person) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("person/afterSave");
        if(null == person.getId())
            iPersonService.save(person);
        else{
            iPersonService.update(person);
        }
        mv.addObject("msg", "save successfully");
        return mv;
    }

    @RequestMapping(value = "/personForm")
    public ModelAndView userForm(@RequestParam Integer id){
        ModelAndView mv = new ModelAndView();
        Person person = iPersonService.selectById(id);
        if(null != person){
            mv.addObject("person", person);
        }
        mv.setViewName("person/personForm");
        return mv;
    }

    @RequestMapping(value="/personList")
    public ModelAndView viewUserList(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("person/personList");
        mv.addObject("personList", iPersonService.selectAll());
        return mv;
    }



}
