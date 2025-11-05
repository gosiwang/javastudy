package com.greedy.level01.basic.student.run;

import com.greedy.level01.basic.student.model.dto.StudentDTO;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 최대 10명의 학생 정보를 저장할 수 있는 배열
        StudentDTO[] students = new StudentDTO[10];

        int count = 0; // 현재 입력된 학생 수

        while (count < students.length) {

            System.out.print("학년 : ");
            int grade = sc.nextInt();

            System.out.print("반 : ");
            int classroom = sc.nextInt();
            sc.nextLine(); // 버퍼 비우기

            System.out.print("이름 : ");
            String name = sc.nextLine();

            System.out.print("국어점수 : ");
            int kor = sc.nextInt();

            System.out.print("영어점수 : ");
            int eng = sc.nextInt();

            System.out.print("수학점수 : ");
            int math = sc.nextInt();

            // StudentDTO 객체 생성 후 배열에 저장
            students[count] = new StudentDTO(grade, classroom, name, kor, eng, math);
            count++;

            System.out.print("계속 추가할 겁니까 ? (y/n) : ");
            char answer = sc.next().charAt(0);

            if (answer == 'n' || answer == 'N') {
                break;
            }
        }

        System.out.println("======================================");
        System.out.println("현재 기록된 학생 정보입니다.\n");

        for (int i = 0; i < count; i++) {
            System.out.println(students[i].getInformation());
        }

        sc.close();
    }
}
