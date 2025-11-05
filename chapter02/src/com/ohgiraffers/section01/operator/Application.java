package com.ohgiraffers.section01.operator;

public class Application {
    public static void main(String[] args){
        int num =12;
        num+=3;


        System.out.println(num);

        num++;
        ++num;
        num--;
        --num;

        int firstNum =20;
        int result1= firstNum++*3;
        System.out.println(result1);
        System.out.println(firstNum);

        int num1 = 20;
        int num2 = 30;
        System.out.println(num1==num2);
        System.out.println(num1!=num2);
        System.out.println(num1<num2);
        System.out.println(num1>num2);
        System.out.println(num1>=num2);
        System.out.println(num1<=num2);

        char ch1 = 'a';
        char ch2 = 'z';
        System.out.println(ch1==ch2);
        System.out.println(ch1!=ch2);
        System.out.println(ch1>=ch2);
        System.out.println(ch1<=ch2);

        String str1 = "java";
        String str2 = "java";

        System.out.println(str1==str2);
        Boolean bool1 = true;
        Boolean bool2 = false;
        System.out.println(bool1==bool2);

    }
}
