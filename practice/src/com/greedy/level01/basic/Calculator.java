package com.greedy.level01.basic;

public class Calculator {

    // 1. 함수 호출 확인용 메소드
    public void checkMethod() {
        System.out.println("메소드 호출 확인");
    }

    // 2. 1부터 10까지 합을 구해 리턴하는 메소드
    public int sum1to10() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        return sum;
    }

    // 3. 두 수 중 큰 수를 출력하는 메소드 (리턴 없음)
    public void checkMaxNumber(int a, int b) {
        int max = (a > b) ? a : b;
        System.out.println("두 수 중 큰 수는 " + max + "이다.");
    }

    // 4. 두 수의 합을 리턴하는 메소드
    public int sumTwoNumber(int a, int b) {
        return a + b;
    }

    // 5. 두 수의 차를 리턴하는 메소드
    public int minusTwoNumber(int a, int b) {
        return a - b;
    }
}
