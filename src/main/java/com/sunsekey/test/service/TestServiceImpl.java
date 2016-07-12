package com.sunsekey.test.service;

import com.sunsekey.test.dao.ITestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/7/9.
 */
@Service
public class TestServiceImpl implements ITestService {

    @Autowired
    @Qualifier(value ="jdbcTestDao")
    private ITestDao jdbcTestDao;

    @Autowired
    @Qualifier(value ="hibernateTestDao")
    private ITestDao hibernateTestDao;
    public String hello(){
        return "Hello World From ServiceImpl;This is user1:" + jdbcTestDao.getUserById(1).toString() + "(BY JDBC)<br/>" + hibernateTestDao.getUserById(1) + "(BY HIBERNATE)";
    }

}
