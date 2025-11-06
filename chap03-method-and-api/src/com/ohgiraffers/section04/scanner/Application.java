package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(java.lang.System.in);

        System.out.print("이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.println("입력하신 이름은 "+name +"입니다.");

        System.out.print("나이르 입력하세요 : ");
        int age = sc.nextInt();
        System.out.println("입력하신 나이는 " + age + "세 입니다.");

        System.out.print("키를 입력하세요: ");
        double height = sc.nextDouble();
        System.out.println("입력하신 키는 " + height + "cm입니다.");

        sc.nextLine();
        System.out.println("아무 문자나 입력 해주세요 : ");
        char ch = sc.nextLine().charAt(0);
        System.out.println("입력하신 문자는 " + ch + "입니다.");
    }
}
