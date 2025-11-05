package com.ohgiraffers.section08.initblock;

public class Product {


    private String name="갤럭시";
    private int price = 10000;

    private static String brand = "상승";
    {
        name = "아이폰";
        price = 150000;

        brand = "사과";
        System.out.println("인스턴스 초기화 블럭 동작함");
    }

    static{
        //name = '이어폰'
        brand = "헬지";
        System.out.println("정적 초기화 블럭 동작함...");
    }

    public Product(){
        System.out.println("기본 생성자 호출됨...");
    }
    public Product(String name, int price, String brand){
        this.name = name;
        this.price = price;
        Product.brand = brand;
        System.out.println("매개변수 생성자 호출됨");
    }

    public String getInformation(){
        return "Product["+ this.name +this.price + Product.brand+"]";

    }
}
