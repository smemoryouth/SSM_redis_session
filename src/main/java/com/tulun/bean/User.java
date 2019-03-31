package com.tulun.bean;

import java.io.Serializable;

/**
 * 描述:
 *
 * @Author shilei
 * @Date 2019/2/17
 */
public class User implements Serializable {
    private String name;
    private String pwd;
    private Integer age;
    private String sex;

    public User() {
    }

    public User(String name, String pwd, Integer age, String sex) {
        this.name = name;
        this.pwd = pwd;
        this.age = age;
        this.sex = sex;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
