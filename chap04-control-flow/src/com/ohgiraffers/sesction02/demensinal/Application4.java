package com.ohgiraffers.sesction02.demensinal;

import java.util.Scanner;

public class Application4 {
    public static void main(String[] args) {

        final int STUDENT_COUNT = 3;
        final int SUBJECT_COUNT = 3;

        String[] subjects = {"국어", "수학", "영어"};
        String[] students = new String[STUDENT_COUNT];
        int[][] scores = new int[STUDENT_COUNT][SUBJECT_COUNT];

        Scanner sc = new Scanner(System.in);

        // 입력부
        for (int i = 0; i < STUDENT_COUNT; i++) {
            System.out.print("이름을 입력하세요: ");
            students[i] = sc.next();

            for (int j = 0; j < SUBJECT_COUNT; j++) {
                System.out.print(subjects[j] + " 성적을 입력하세요: ");
                scores[i][j] = sc.nextInt();
            }
        }

        // 출력부
        for (int i = 0; i < STUDENT_COUNT; i++) {
            int sum = 0;
            for (int j = 0; j < SUBJECT_COUNT; j++) {
                sum += scores[i][j];
            }
            double avg = sum / (double) SUBJECT_COUNT;
            System.out.println(students[i] + "의 총점은 " + sum + "이고 평균은 " + avg + "입니다.");
        }
    }
}
