package com.didispace.domain;

import java.io.Serializable;

/**
 * Created by Yuanping on 2017/9/17.
 */
public class Teacher implements Serializable {
    private static final long serialVersionUID = -1L;
    private String username;
    private Integer age;
    public Teacher(String username, Integer age) {
        this.username = username;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
