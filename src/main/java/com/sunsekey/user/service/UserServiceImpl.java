package com.sunsekey.user.service;

import com.sunsekey.user.dao.IUserDao;
import com.sunsekey.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/7/12.
 */
@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    private IUserDao userDao;

    public void save(User user) {
        userDao.save(user);
    }
}
