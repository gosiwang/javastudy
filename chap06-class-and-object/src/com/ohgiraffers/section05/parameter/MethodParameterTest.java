package com.ohgiraffers.section05.parameter;

import java.util.Arrays;

public class MethodParameterTest {
    /*기본 자료형 : 파라미터로 '값'이 복사되어 넘어온다*/

    public void testPrimitiveType(int num){
        System.out.println("전달받은 num : " + num );
        num = 99; // 복사본의 값을 변경
        System.out.println("변경 후 num : " + num);
    }
    /*배열(참조 자료형) : 파라미터로 '주소값'이 복사되어 넘어온다.(얕은 복사)*/
    public void testArraysParameter(int[]arr){
        System.out.println("전달받은 arr = " + Arrays.toString(arr));
        arr[0]=99;
        System.out.println("전달받은 arr = " + Arrays.toString(arr));
    }
    public void testObjectParameter(Rectangle rect){
        System.out.println("전달받은 사각형 너비+" + rect.getWidth());
        rect.setWidth(100);
        rect.setHeight(100);
        System.out.println("변경후 사각형 너비= "+rect.getWidth());
    }
    /*가변 인자는 메소드 내부에서 배열로 취급된다.*/

    public void orderPizza(String customerName, String...toppings){
        System.out.println(customerName + "고객님!!");
        System.out.println("주문하신 피자 토핑: " + Arrays.toString(toppings));
    }
}
