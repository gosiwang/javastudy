package com.ohgiraffers.sesction03.branching;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {

        double[] scores = new double[5];
         double mer = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.print("점수를 입력하세요: ");
            scores[i] = sc.nextDouble();
            mer = mer + scores[i];
        }
        double avg = mer / scores.length;
        System.out.println("합계: "+ mer);
        System.out.println("평균: "+ avg);
    }
}
