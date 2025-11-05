package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Application app = new Application();
        app.testSimpleIf();
        app.testGradeCalculation();
        app.testSimpleIf();
    }
    public void testSimpleIf(){
        Scanner sc = new Scanner(System.in);
        System.out.println("수저 한 개를 입력하세요 : ");
        int num = sc.nextInt();

        if (num %2==0){
            System.out.println("입력하신 숫자는 짝수입니다ㅏ.");
        }
        System.out.println("프로그램을 종료합니다,");

    }

    public void testNestedIf(){
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 한개 입력하세요");
        int num = sc.nextInt();
        if (num>0){

            //두번 째 조건:
            if(num%2==0){
                    System.out.println("입력하신"+num+"은 양수이면서 짝수입니다.");
            }
            if(num>0&&num%2==0){
                System.out.println("입력하신 숫자는 양수이면서 짟수입니다.");
            }
        }

        }

        public void testGradeCalculation(){
        Scanner sc = new Scanner(System.in);
        System.out.print("학생의 점수를 입력하세요: " );
        int point = sc.nextInt();
        String grade = "";

        if (point >= 90) {
            grade = "A";
            if (point >= 95) {grade+="+";}
        } else if(point >= 80) {
            grade = "B";
            if (point >= 85) {grade+="+";}
        }else if(point >= 70) {
            grade = "C";
            if(point >= 75) {grade+="+";}
        }else if(point >= 60) {
            grade = "D";
            if(point >= 65) {grade+="+";}
        }else{
            grade = "F";
        }
        System.out.println("점수는 "+grade+"입니다");
    }
    public void testSimpleSwitch(){
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수 입력: ");
        int first =sc.nextInt();
        System.out.print("두번째 정수 입력: ");
        int second =sc.nextInt();
        System.out.print("연산 기호 입력(+,-:)");
        char op = sc.next().charAt(0);

        int result =0;
        switch(op){
            case '+':
                result = first+second;
                break;
            case '-':
                result = first-second;
            case '*':
                result = first*second;
            case '/':
                result = first/second;
            case '%':
                result = first%second;
                break;
            default:
                System.out.println("잘못된 연산 기호를 입력하셨습니다.");
                return;
        }
        System.out.println(first+""+op+""+second+"="+result);


    }
}
