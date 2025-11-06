package com.ohgiraffers.section02.set;

import java.util.*;

public class Application2 {
    public static void main(String[] args) {
        /*
        * LinkedHashSet
        * '증복 불가'의 특징은 그대로 유지한다.
        * - 추가적으로 요소가 입력된 순서를 기억하여 순서를 유지하는 특징을 가진다.
        * */

        Set<String> hset = new HashSet<>();
        hset.add("java");
        hset.add("html");
        hset.add("css");
        hset.add("java");

        Set<String> lhset = new LinkedHashSet<>();
        lhset.add("java");
        lhset.add("mysql");
        lhset.add("jdbc");
        lhset.add("java");

        System.out.println("HashSet 결과 :" + hset);
        System.out.println("LinkedHashSet 결과 : " + lhset);

    }
}
