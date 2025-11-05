package com.ohgiraffers.section05.parameter;

import java.util.Arrays;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        MethodParameterTest pt = new  MethodParameterTest();

        int num = 20;
        System.out.println("호출 전 main의 num: " + num);
        pt.testPrimitiveType(num);
        System.out.println("호출 후 main의 num: " + num);

        int[]iarr= {1,2,3,4,5};
        System.out.println("호출 전: "+ Arrays.toString(iarr));

        pt.testArraysParameter(iarr); //

        System.out.println("호출 후: "+ Arrays.toString(iarr));

        Rectangle r1 = new Rectangle(12.5,22.5);
        System.out.println("호출 전 main 사각형 정보 : ");
        r1.printInfo();
        pt.testObjectParameter(r1);
        System.out.println("호출 후 main 삭가형 정보: ");
        r1.printInfo();

        //가변인자
        pt.orderPizza("홍길동");
        pt.orderPizza("유관순","불고기");
        pt.orderPizza("이순신","치즈","페페로니","올리브");
    }

}
