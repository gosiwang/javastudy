package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ================================
        // 실습문제 1: 두 수 중 큰 수
        System.out.println("실습문제 1: 두 수 중 큰 수");
        System.out.print("첫 번째 정수 입력: ");
        int a = sc.nextInt();
        System.out.print("두 번째 정수 입력: ");
        int b = sc.nextInt();
        int max = (a > b) ? a : b;
        System.out.println("두 수 중 큰 수는 " + max + "입니다.\n");

        // ================================
        // 실습문제 2: 점수 합격 여부
        System.out.println("실습문제 2: 점수 합격 여부");
        System.out.print("점수 입력: ");
        int score = sc.nextInt();
        String result = (score >= 60) ? "합격입니다~~!!!" : "아쉽지만 불합격입니다…";
        System.out.println(result + "\n");

        // ================================
        // 실습문제 3: 짝수/홀수 판단
        System.out.println("실습문제 3: 짝수/홀수 판단");
        System.out.print("정수 입력: ");
        int num = sc.nextInt();
        String parity = (num % 2 == 0) ? "입력하신 수는 짝수입니다." : "입력하신 수는 홀수입니다.";
        System.out.println(parity + "\n");

        // ================================
        // 실습문제 4: 점수 등급
        System.out.println("실습문제 4: 점수 등급");
        System.out.print("이름 입력: ");
        sc.nextLine(); // 개행 처리
        String name = sc.nextLine();
        System.out.print("실수 점수 입력: ");
        double scoreDouble = sc.nextDouble();
        int intScore = (int)scoreDouble;

        String grade = (intScore >= 90) ? "A" :
                (intScore >= 80) ? "B" :
                        (intScore >= 70) ? "C" :
                                (intScore >= 60) ? "D" : "F";
        System.out.println(name + "의 이번 점수등급은 " + grade + "입니다.\n");

        // ================================
        // 실습문제 5: 월/일에 따른 선물
        System.out.println("실습문제 5: 월/일에 따른 선물");
        System.out.print("이름 입력: ");
        sc.nextLine(); // 개행 처리
        String giftName = sc.nextLine();
        System.out.print("월 입력: ");
        int month = sc.nextInt();
        System.out.print("일 입력: ");
        int day = sc.nextInt();

        String gift = ((month >= 1 && month <= 6) && (day >= 1 && day <= 15)) ? "배민 쿠폰" :
                ((month >= 7 && month <= 12) && (day >= 16 && day <= 31)) ? "스타벅스 커피" :
                        "사탕";

        System.out.println(giftName + "의 선물은 " + gift + "입니다.");

        sc.close();
    }
}

