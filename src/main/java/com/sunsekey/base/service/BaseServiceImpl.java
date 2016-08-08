package com.sunsekey.base.service;

import com.sunsekey.base.dao.IBaseDao;

import java.util.List;

/**
 * Created by Administrator on 2016/8/5.
 */
public abstract class BaseServiceImpl<T> implements IBaseService<T> {

    public abstract IBaseDao getBaseDao();

    public boolean save(T t) {
        try {
            getBaseDao().save(t);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public boolean update(T t) {
        try {
            getBaseDao().update(t);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public List selectAll() {
        return getBaseDao().selectAll();
    }

    public boolean delete(Integer id) {
        T t = selectById(id);
        try {
            getBaseDao().delete(t);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public T selectById(Integer id) {
        try {
            return (T)getBaseDao().selectById(id);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
