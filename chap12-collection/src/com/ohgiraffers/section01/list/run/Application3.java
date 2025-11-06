package com.ohgiraffers.section01.list.run;

import java.util.LinkedList;
import java.util.List;

public class Application3 {
    public static void main(String[] args) {
        /*LinkedList
        * ArrayList가 배열을 이요하는 것과 달ㄹ, '이중 연결 리스트' 방식으로 데이터를 관리한다.
        * 각 요소는 자신의 앞/뒤 요소만 기억한다.
        *
        * 장점 : 중간에 데이터를 추가하거나 삭제할 때, 앞뒤 연결만 바꿔주면 되므로 매우빠르다.
        * 단점 : 특정 위치(인덱스)의 데이터를 찾으려면, 처음부터 순서대로 찾아가야 하므로 조회속도가 느리다.*/
        List<String> linkedList = new LinkedList<String>();
        linkedList.add("apple");
        linkedList.add("orange");
        linkedList.add("pear");

        System.out.println(linkedList.get(0));

        linkedList.remove(1);

        System.out.println("삭제 후: " + linkedList);
        
    }
}
