package com.sunsekey.base.controller;

import com.sunsekey.base.service.IBaseService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/8/7.
 */
public abstract class BaseController<T> {

    public abstract IBaseService<T> getIBaseService();

    @RequestMapping(value="/delete")
    @ResponseBody
    public Map<String,Object> delete(Integer id) {
        Map<String, Object> map = new HashMap<String, Object>();
        boolean flag = getIBaseService().delete(id);
        map.put("success", flag);
        return map;
    }
}
