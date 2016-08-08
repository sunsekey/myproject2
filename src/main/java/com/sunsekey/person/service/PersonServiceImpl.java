package com.sunsekey.person.service;

import com.sunsekey.base.dao.IBaseDao;
import com.sunsekey.base.service.BaseServiceImpl;
import com.sunsekey.entity.Idea;
import com.sunsekey.entity.Person;
import com.sunsekey.person.dao.IPersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/8/7.
 */
@Service
public class PersonServiceImpl extends BaseServiceImpl<Person> implements IPersonService {
    @Autowired
    private IPersonDao iPersonDao;
    @Override
    public IBaseDao getBaseDao() {
        return iPersonDao;
    }

}
