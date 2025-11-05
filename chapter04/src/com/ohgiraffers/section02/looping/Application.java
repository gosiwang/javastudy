package com.ohgiraffers.section02.looping;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Application app = new Application();
        //app.whyNeedLoops();
       // app.nestedForLoop();
       // app.nestedForLoop2();
        app.whileLoop();
        app.whileLoop2();
    }
    public void whyNeedLoops(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1번째 학생의 이름 입력해주세요 : ");
        String studunt1 = sc.nextLine();
        System.out.println("1번째 학생의 이름은 "+studunt1+"입니다");

        System.out.println("2번째 하생의 이름 입력해주세요:");
        String studunt2 = sc.nextLine();
        System.out.println("2번째 학생의 이름은 "+studunt2+"입니다.");

        for (int i = 0; i<=10; i++){
            System.out.println(i+"번째 학생의 이름을 입력해주세요 : ");
            String student = sc.nextLine();
            System.out.println(i+"번째 학생의 이름은 "+ student + "입니다.");

        }
    }
    public void forLoopSum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("합계를 구할 양의 정수를 입력하세요");
        int num = sc.nextInt();

        int sum =0;
        for (int i =1; i<=num; i++){
            sum+=i;
        }
        System.out.println("1부터" +num+"까지의 합은"+sum);
    }
    public void nestedForLoop(){
        for (int dan = 2; dan <= 9; dan++){
            System.out.println("---"+dan+"단 ----");
            for(int su=1; su<=9; su++){
                System.out.println(dan + "*" +su+"="+dan*su);
            }
            System.out.println();
        }
    }
    public void nestedForLoop2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 줄 수를 입력하세요: ");
        int rows = sc.nextInt();
        for (int i=1; i<=rows; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

        }

        for (int i=1; i<=rows; i++){
            for(int j=rows; j>=i; j--){
                System.out.print("*");
            }
        }
    }
    public void whileLoop(){
        Scanner sc = new Scanner(System.in);
        String str = "";
        while(str.equals("exit")){
            System.out.println("문자열을 입력하세요");
            str = sc.nextLine();
            System.out.println("입력한 문자열:"+str);

        }
        System.out.println("프로그램을 종료합니다.");
    }
    public void whileLoop2(){
        Scanner sc = new Scanner(System.in);
        String str;

        do{
            System.out.println("문자열을 입력하세요('exit'입력시 종료:");
            str = sc.nextLine();
            System.out.println("입력한 문자열:"+str);

        }while(!str.equals("exit"));


    }
}
