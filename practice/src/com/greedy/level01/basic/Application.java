package com.greedy.level01.basic;

public class Application {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        // 1. 메소드 호출 확인용 메소드 호출
        calc.checkMethod();

        // 2. 1부터 10까지의 합 출력
        int sum = calc.sum1to10();
        System.out.println("1부터 10까지의 합 : " + sum);

        // 3. 두 수 중 큰 수 출력
        calc.checkMaxNumber(10, 20);

        // 4. 두 수의 합 출력
        int resultSum = calc.sumTwoNumber(10, 20);
        System.out.println("10과 20의 합은 : " + resultSum);

        // 5. 두 수의 차 출력
        int resultMinus = calc.minusTwoNumber(10, 5);
        System.out.println("10과 5의 차는 : " + resultMinus);
    }
}
