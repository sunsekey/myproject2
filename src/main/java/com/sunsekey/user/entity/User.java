package com.sunsekey.user.entity;

import java.io.Serializable;
import java.util.StringTokenizer;

import javax.persistence.Transient;

/**
 * Created by Administrator on 2016/7/9.
 */
public class User implements Serializable {

    private Integer id;
    private String account;
    private String password;
    private Integer age;
    private String sex;
    private String firstName;
    private String lastName;
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setName(String name) {
        firstName = "";
        lastName = "";
        if (name != null && !name.isEmpty()) {
            StringTokenizer stringTokenizer = new StringTokenizer(name);
            firstName = stringTokenizer.nextToken();
            if(stringTokenizer.hasMoreTokens()){
                lastName = stringTokenizer.nextToken();
            }
        }
    }

    public String getName() {
        return firstName + " " +lastName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
