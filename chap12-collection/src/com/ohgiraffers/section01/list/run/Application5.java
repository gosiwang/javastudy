package com.ohgiraffers.section01.list.run;

import java.util.LinkedList;
import java.util.Queue;

public class Application5 {
    public static void main(String[] args) {
        /*Queuw (큐)
        * -선입선출(fifo) 방식의 자료구조이다.
        * -큐는 인터페이스이므로, 실재로는 이를 구현한 LinkedList등의 클래스를 사용해 인스턴스를 생성한다.*/

        Queue<String> que = new LinkedList<>();

        que.offer("first");
        que.offer("third");
        que.offer("third");

        System.out.println(que);

        System.out.println("peak() " + que.peek());
        System.out.println(que);

        System.out.println("poll() " + que.poll());
        System.out.println(que);

        //큐가 비어있는 경우 null을 반환한다.
        que.poll();
        que.poll();// 여기서 빔
        que.poll();

    }
}
