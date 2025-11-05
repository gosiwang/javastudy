package com.ohgiraffers.section01.operator;

public class Applicatipn12 {
    public static void main(String[] args) {

        /**
         * 논리값을 취급하는 연산자이다
         * 1. 논리 연결 연산자
         * -&&(논리 and) 연산자:*/
        System.out.println(true&&true);
        System.out.println(false&&false);
        System.out.println(true||false);

        int a = 30;
        int b = 10;
        int c = 2134;
        int d = 23;

        System.out.println(a<b&&c<d);
        System.out.println(a<b||c<d);

        int num1 =55;
        System.out.println("1부터 100사이인지 확인: "+(num1>=1&&num1<=100));

        char ch1 = 'G';
        System.out.println("영어 대문자인지 확인:" +(ch1>='A'&&ch1<='Z'));

        int num2 = 10;
        int result1 = (false && ++num2> 0)? num2:num2;
        int num3=10;
        int result2 = (true && ++num3>0)? num3:num3;

        /* 삼항연산자
        피연산자 항목이 3개이 연산자이다.
        (조건식)? 참일 때 사용할 값: 거짓일 때 사용할 값2

         */

        int num4 = 10;
        int num5 =20;
        String result3 = (num4>0)? "양수다 ": "양수가 아니다.";
        String result4 = (num5>0)? "양수다 ": "양수가 아니다.";
        System.out.println("result3="+result3);
        System.out.println("result4="+result4);
        String result5 = (num4<0)? "음수다.":(num4==0)?"0이다":"양수다";
        System.out.println("result5="+result5);
    }
}
