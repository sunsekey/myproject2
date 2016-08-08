package com.sunsekey.user.service;

import com.sunsekey.base.dao.IBaseDao;
import com.sunsekey.base.service.BaseServiceImpl;
import com.sunsekey.entity.User;
import com.sunsekey.user.dao.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/7/12.
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements IUserService{

    @Autowired
    private IUserDao userDao;

    @Override
    public IBaseDao getBaseDao() {
        return userDao;
    }

}
