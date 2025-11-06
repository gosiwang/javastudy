package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();
        System.out.println("나이는 "+ age + "세 입니다.");

        sc.nextLine();
        System.out.print("사는 곳을 입력하세요 : ");
        String address =sc.nextLine();
        System.out.println("사는 곳은 " + address + "입니다.");

        System.out.print("나이를 입력하세요: ");
        String ageInput = sc.nextLine();
        int age1 = Integer.parseInt(ageInput);
        System.out.println("입력한 나이는 "+age+ "세 입니다,");

        System.out.print("인사말을 입력해주세요 : ");
        String greeting = sc.nextLine();
        System.out.println(greeting);

        sc.close();
    }
}
