package com.hw1.run;

import com.hw1.model.dto.Employee;
import com.hw1.model.dto.Student;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
        students[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
        students[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");
        System.out.println("===== 학생 정보 =====");
        for (Student s : students) {
            System.out.println(s.information());
        }

        // 2. 사원 정보
        Employee[] employees = new Employee[10];
        Scanner sc = new Scanner(System.in);
        int count = 0;

        while (true) {
            System.out.print("\n사원 정보를 입력하시겠습니까? (y/n): ");
            String answer = sc.nextLine();

            if (!answer.equalsIgnoreCase("y")) break;

            System.out.print("이름: ");
            String name = sc.nextLine();

            System.out.print("나이: ");
            int age = Integer.parseInt(sc.nextLine());

            System.out.print("키: ");
            double height = Double.parseDouble(sc.nextLine());

            System.out.print("몸무게: ");
            double weight = Double.parseDouble(sc.nextLine());

            System.out.print("급여: ");
            int salary = Integer.parseInt(sc.nextLine());

            System.out.print("부서: ");
            String dept = sc.nextLine();

            employees[count++] = new Employee(name, age, height, weight, salary, dept);

            if (count >= employees.length) break; // 최대 10명 제한
        }

        System.out.println("\n===== 현재 등록된 사원 정보 =====");
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i].information());
        }

        sc.close();
    }

}
