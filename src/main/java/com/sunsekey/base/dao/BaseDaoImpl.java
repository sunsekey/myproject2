package com.sunsekey.base.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by Administrator on 2016/8/5.
 */
public abstract class BaseDaoImpl<T> implements IBaseDao<T> {

    @Autowired
    SessionFactory sessionFactory;

    private Class<T> entityClass;

    public BaseDaoImpl() {
        Type genType = getClass().getGenericSuperclass();
        Type[] params = ((ParameterizedType) genType).getActualTypeArguments();
        entityClass = (Class<T>) params[0];
    }
    protected Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    public void save(T t) {
        getCurrentSession().save(t);
    }

    public void update(T t) {
        getCurrentSession().update(t);
    }

    public abstract List selectAll();

    public void delete(Object o) {
        getCurrentSession().delete(o);
    }

    public T selectById(Integer id) {
        return (T)getCurrentSession().get(entityClass, id);
    }

}
