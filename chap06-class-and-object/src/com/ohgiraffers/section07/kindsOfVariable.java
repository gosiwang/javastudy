package com.ohgiraffers.section07;

public class kindsOfVariable {

    private int globalNum;

    private static int staticNum;

    public void method(int num){
        int localNum;
        System.out.println(num);
    }
    public void method2(){
        System.out.println(globalNum);
        System.out.println(staticNum);

    }
}
