package com.ohgiraffers.section03.dto;

public class Application {
    public static void main(String[] args) {


        MemberDTO member= new MemberDTO();

        member.setNumber(1);
        member.setName("홍길동");
        member.setAge(18);
        member.setGender('남');
        member.setHeight(1004);
        member.setWeight(80.2);
        member.setIsActivated(true);

        System.out.println(member.getNumber());
        System.out.println(member.getName());
        System.out.println(member.getAge());
        System.out.println(member.getGender());
        System.out.println(member.getHeight());
        System.out.println(member.getWeight());
        System.out.println(member.isActivated());

    }
}
