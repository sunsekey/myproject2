package com.sunsekey.user.service;

import com.sunsekey.user.dao.IUserDao;
import com.sunsekey.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/7/12.
 */
@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    private IUserDao userDao;

    public boolean save(User user) {
        try {
            userDao.save(user);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public boolean update(User user) {
        try {
            userDao.update(user);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public List<User> selectAll() {
        return userDao.selectAll();
    }

    public boolean delete(Integer id) {
        User user = selectById(id);
        try {
            userDao.delete(user);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public User selectById(Integer id) {
        try {
            User user = userDao.selectById(id);
            user.setName(user.getName());
            return user;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

}
