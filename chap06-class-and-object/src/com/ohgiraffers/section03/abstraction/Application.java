package com.ohgiraffers.section03.abstraction;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        CarRacer racer = new CarRacer();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("========r거래싱상===========");
            System.out.println("1. 시동걸기");
            System.out.println("2. 시동걸기");
            System.out.println("3. 시동걸기");
            System.out.println("4. 시동걸기");
            System.out.println("9. 시동걸기");
            System.out.print("메뉴 선택: ");
            int no = sc.nextInt();
            switch (no) {
                case 1:
                    racer.startUp();
                    break;
                case 2:
                    racer.stepAccelator();
                    break;
                case 3:
                    racer.stepBreak();
                    break;
                case 4:
                    racer.trunoff();
                    break;
            }
        }
    }
}
