package com.sunsekey.user.dao;

import com.sunsekey.base.dao.BaseDaoImpl;
import com.sunsekey.entity.User;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2016/7/12.
 */
@Repository
public class UserDao extends BaseDaoImpl<User> implements IUserDao {

    @Override
    public List selectAll() {
        Query query = getCurrentSession().createQuery("from User as u");
        List<User> list = query.list();
        return list;
    }
}
