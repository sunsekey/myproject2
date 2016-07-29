package com.sunsekey.user.dao;

import com.sunsekey.user.entity.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2016/7/12.
 */
@Repository
public class UserDao implements IUserDao {

    @Autowired
    SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    public void save(User user) {
        getCurrentSession().save(user);
    }

    public void update(User user) {
        getCurrentSession().update(user);
    }

    public List<User> selectAll() {
        Query query = getCurrentSession().createQuery("from User as u");
        List<User> userList = query.list();
        return userList;
    }

    public void delete(User user) {
        getCurrentSession().delete(user);
    }

    public User selectById(Integer id) {
        return (User)getCurrentSession().get(User.class, id);
    }

}
