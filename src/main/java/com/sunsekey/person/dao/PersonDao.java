package com.sunsekey.person.dao;

import com.sunsekey.base.dao.BaseDaoImpl;
import com.sunsekey.entity.Idea;
import com.sunsekey.entity.Person;
import com.sunsekey.entity.User;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Administrator on 2016/8/5.
 */
@Repository
public class PersonDao extends BaseDaoImpl<Person> implements IPersonDao{

    @Override
    public List selectAll() {
        Query query = getCurrentSession().createQuery("from Person as p");
        List<Person> list = query.list();
        return list;
    }

    @Override
    public void save(Person person) {
        //saveFromIdea(person);
        saveFromPerson(person);
    }

    public void saveFromPerson(Person person) {
        Idea idea1 = new Idea();
        Idea idea2 = new Idea();
        idea1.setContent("thingking python");
        idea2.setContent("thinging ruby");
        idea1.setPerson(person);
        idea2.setPerson(person);
        Set<Idea> ideas = new HashSet<Idea>();
        ideas.add(idea1);
        ideas.add(idea2);
        person.setIdeas(ideas);
        getCurrentSession().save(person);
    }

    public void saveFromIdea(Person person){
        Idea idea1 = new Idea();
        Idea idea2 = new Idea();
        idea1.setPerson(person);
        idea1.setContent("thingking java");
        idea2.setContent("thinging c++");
        idea2.setPerson(person);
        getCurrentSession().save(idea1);
        getCurrentSession().save(idea2);
    }
}
