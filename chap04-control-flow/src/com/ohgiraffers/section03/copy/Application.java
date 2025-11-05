package com.ohgiraffers.section03.copy;

public class Application {
    public static void main(String[] args) {


        int[] originArr={1,2,3,4,5};

        int[] copyArr=originArr;

        System.out.println(originArr.hashCode());
        System.out.println(copyArr.hashCode());

        System.out.println(originArr[4]);
        copyArr[4]=90;
        System.out.println(originArr[4]);


    }
}
