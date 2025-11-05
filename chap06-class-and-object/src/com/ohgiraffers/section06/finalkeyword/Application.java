package com.ohgiraffers.section06.finalkeyword;

public class Application {
    public static void main(String[] args) {

        /*
         * final 키워드
         * 1. 변수(지역/필드)에 사용: 값 변경 불가 -> '상수'가 된다
         * */

        System.out.println("원주율: " + MathConstant.PI);
        /*MathConstant.PI = 3,14;*/

        Person person = new Person("00000-111111", "홍길동");
        person.setName("홍길동 주니어");
        //person.ssn = "01010-32435"; // final필드는 외부에서도 변경 불가능
            Child child = new Child();
            child.coreMethod();
    }
}
