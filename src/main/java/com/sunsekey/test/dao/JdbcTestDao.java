package com.sunsekey.test.dao;

import com.sunsekey.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Administrator on 2016/7/9.
 */
@Repository("jdbcTestDao")
public class JdbcTestDao extends SimpleJdbcDaoSupport implements ITestDao{

    private final String QUERY_USER_PRE_SQL = "SELECT * FROM USER WHERE ID=";
    public User getUserById(int id) {
        SimpleJdbcTemplate simpleJdbcTemplate = getSimpleJdbcTemplate();
        return simpleJdbcTemplate.queryForObject(QUERY_USER_PRE_SQL + id,new ParameterizedRowMapper<User>(){

            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                User user = new User();
                user.setId(resultSet.getInt(1));
                user.setName(resultSet.getString("name"));
                user.setAccount(resultSet.getString("account"));
                user.setPassword(resultSet.getString("password"));
                user.setAge(resultSet.getInt("age"));
                user.setSex(resultSet.getString("sex"));
                return user;
            }
        });
    }

    //继承的SimpleJdbcDaoSupport需要注入我们定义的DataSource。因为父类的属性设置为private了，只能通过setter来注入
    @Autowired
    public void setJt(DataSource dataSource){
        super.setDataSource(dataSource);
    }

}
