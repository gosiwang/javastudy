package com.ohgiraffers.sesction03.branching;

public class Application {
    public static void main(String[] args) {


        Application app = new Application();

        //app.simpleBreack();
        app.handleNestedBreak();
    }

    public void simpleBreack() {

        int sum = 0;
        int i = 1;

        while (true) {
            sum += i;
            System.out.println(i + "를 더했다. 현재 합계 :" + sum);

            // 만약 i가 10이 되면 이라는 탈출 조건을 만든다.
            if (i == 10) {
                System.out.println("i가 10이 되어 break로 반복문을 탈추한다!");
                break;
            }
            i++;   // break 조건이 아니면 i를 1증가시키고 다시 반복
        }
        System.out.println("최종 합은" + sum + "입니다.");

    }

    // break는 자신을 감싸고 있는 가장 '가장 가까운' 빈복문 하나만 탈출한다.
    public void nestedBreak() {

        for (int dan = 2; dan < 10; dan++) {
            System.out.println("---" + dan + "단 시작----");
            for (int su = 1; su < 10; su++) {
                if (su > 5) {
                    break; // 안쪽 for문을 탈훌하라는 신호
                }
                System.out.println(dan + "" + su + "=" + dan *su);
            }
        }
    }

    public void simpleContinue() {
        System.out.println("1부터 100사이의 4와 5의 공배수(20의 배수)만 출력합니다.");

        for (int i = 1; i <= 100; i++) {
            // 4의 배우이면서 동시에 5의 배수가 아니라면
            if(!(i%4==0 && i%5==0)) {
            continue;}

            System.out.println(i);
        }
        }
        public void handleNestedBreak() {
        ohgiraffers: //바깥쪽 for문에 이름표를 붙임

            System.out.println("Flag 변수 사용");

            boolean isBreak = false; //탈출 신호를 보낼 Flag 변수(깃발)
            for (int dan = 2; dan <= 100; dan++) {
                for(int su = 1; su <= 10; su++) {
                    if (dan ==3 && su==5){
                        isBreak = true;
                        break ;
                    }
                    System.out.println(dan + "*" + su + "=" + dan);
                }

                // 안쪽 반복문이 끝난 직후, Flag 변수를 확인한다.
                if (isBreak) {
                    break; // 탈출신호가 있다면 바깥쪽 반복문도 탈출한다.

                }
                System.out.println();
            }

        }

    }