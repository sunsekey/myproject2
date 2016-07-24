package com.sunsekey.base.service;

import java.util.List;

/**
 * Created by Administrator on 2016/7/12.
 */
public interface IBaseService<T>{
    boolean save(T t);

    List<T> selectAll();

    boolean delete(Integer id);

    T selectById(Integer id);
}
