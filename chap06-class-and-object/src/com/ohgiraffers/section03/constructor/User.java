package com.ohgiraffers.section03.constructor;

import java.util.Date;

public class User {

    private String id;
    private String pwd;
    private String name;
    private java.util.Date enrollDate;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Date getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(Date enrollDate) {
        this.enrollDate = enrollDate;
    }
    public User(String id, String pwd, String name, java.util.Date enrollDate) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        System.out.println("id pwd name을 초기환하는 생성자 호출");
    }


}
