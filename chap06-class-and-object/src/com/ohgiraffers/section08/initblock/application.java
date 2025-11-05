package com.ohgiraffers.section08.initblock;

public class application {
    public static void main(String[] args) {
         /*초기화 블록
         * 복잡한 초기화를 수행할 수 있는 블록, 인스턴스 초기화 블럭과 정적 초기화 블럭으로 구분된다.
         * 1. 인스턴스 초기화 블록
         *  - 인스턴스가 생성되는 시점에 생성자 호출 이전에 먼저 실행된다.
         * - 인스턴스를 호출하는 시점마다 호출이 된다.
         * - 인스턴스변수를 초기화하며 정적필드에는 실행시점마다 값을 덮어쓴다.*/


        Product product = new Product();

        Product product2 = new Product("대륙폰",50000,"TKDNALL");

        System.out.println(product.getInformation());
        System.out.println(product2.getInformation());
    }
}
