package com.sunsekey.base.dao;

import java.util.List;

/**
 * Created by Administrator on 2016/7/12.
 */
public interface IBaseDao<T> {

    void save(T t);

    void update(T t);

    List<T> selectAll();

    void delete(T t);

    T selectById(Integer id);
}
