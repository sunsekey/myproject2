package com.sunsekey.user.dao;

import com.sunsekey.user.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2016/7/12.
 */
@Repository
public class UserDao implements IUserDao{

    @Autowired
    SessionFactory sessionFactory;

    private Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }
    public void save(User user) {
        getCurrentSession().save(user);
    }

    public User getUser(Integer id) {
        return (User)getCurrentSession().get(User.class, id);
    }
}
