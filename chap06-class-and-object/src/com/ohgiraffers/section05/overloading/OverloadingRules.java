package com.ohgiraffers.section05.overloading;

public class OverloadingRules {

    /* 메소드 시그니처를 기준으로 오버로딩의 성립 조건을 이해할 수 있다.
    *
    * [메소드 시그니처]
    * 메소드를 식별하기 위한 고유한 이름표
    * '메소드 이름' '매개변수 리스트(타입, 개수, 순서)'
    * ex) test(int num, String name)
    *
    * 오버로딩 : 이름은 같지만, 시그니처가 다른 메소드를 여러 개 정의하는 기술
    *
    * */
    public void test(){
        // 1. 매개변수 '개수/가 다르면 오버로딩 성립


    }
    public void test(int num){

    }
    public void test(String str){}

    public void test(int num,String str){}
    public void test(String str,int num){}

/*오버로딩이 성립하지 않는 경우 */
    //public int test(){}
    //private void test(){}
    //public void test(int num2){}
}
