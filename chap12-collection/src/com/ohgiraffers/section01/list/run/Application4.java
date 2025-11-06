package com.ohgiraffers.section01.list.run;

import java.util.EmptyStackException;
import java.util.Stack;

public class Application4 {
    public static void main(String[] args) {

        /*Stack
        * 후입 선출 방식의 자료구조이다
        * */
        Stack<Integer> integerStack = new Stack<>();

        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);

        System.out.println(integerStack);

        /*
        * peek() : 가장 꼭대기 요소를 '확인'만 하고 제거하지는 않는다.
        * pop() : 가장 꼭대기 요소를 "꺼내고' 제거한다.
        * */
        System.out.println("peek() : " + integerStack.peek());
        System.out.println(integerStack);

        System.out.println("pop() : " + integerStack.pop());
        System.out.println(integerStack);

        integerStack.pop();
        integerStack.pop();
        integerStack.pop();
        integerStack.pop();

        try{
            integerStack.pop();
            integerStack.pop();
            integerStack.pop();
            integerStack.pop();
        } catch(EmptyStackException e){
            System.out.println("스택이 비어있습니다.");
        }
    }
}
