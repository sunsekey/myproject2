package com.sunsekey.test.dao;

import com.sunsekey.user.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2016/7/10.
 */
@Repository("hibernateTestDao")
public class HibernateTestDao implements ITestDao {
    private final String QUERY_USER_PRE_SQL = "SELECT * FROM USER WHERE ID=";
    @Autowired
    private SessionFactory sessionFactory;

    public Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }

    public User getUserById(int id) {
        User user = (User)getCurrentSession().get(QUERY_USER_PRE_SQL + id,new User());
        return user;
    }
}
