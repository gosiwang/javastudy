package com.ohgiraffers.section02.uses;

public class Member {

    private int num;
    private String id;
    private String pwd;
    private String name;
    private int age;
    private char gender;

    public Member() {}

    public Member(int num, String id, String pwd, String name, int age, char gender) {
        this.num = num;
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getNum() {
        return num;
    }

    public String getId() {
        return id;
    }

    public String getInformation() {
        return "번호: " + num + ", 이름: " + name + ", 아이디: " + id +
                ", 나이: " + age + ", 성별: " + gender;
    }
}
