package com.sunsekey.user.service;

import com.sunsekey.base.service.IBaseService;
import com.sunsekey.user.entity.User;

/**
 * Created by Administrator on 2016/7/12.
 */
public interface IUserService extends IBaseService<User>{

    void getAndPrintUser(Integer id);

    void saveOpr(User user);
}
