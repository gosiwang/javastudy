package com.ohgiraffers.section02.set;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        /*Set 인터페이스를 구현한 컬렉션 클래스의 특징
        * 1. ㅇ요소의 저장 순서를 유지하지 않는다.(입력 순서와 출력순서가 다를 수 있다.)
        * 2. 같은 요소의 중복 저장을 허용하지 않는다. (똑같은 값은 하나만 저장한다.)
        * */

        List<String> alist = new ArrayList<>();
        alist.add("java");
        alist.add("mysql");
        alist.add("jdbc");
        alist.add("java");

        Set<String> hset = new HashSet<>();
        hset.add("java");
        hset.add("html");
        hset.add("css");
        hset.add("java");

        System.out.println("ArrayList : " + alist);
        System.out.println("Hashset : " + hset);

        /*Set은 순서(인덱스)가 없기 때문에, List처러머 get(index)를 사용하여 요소를 꺼낼 수 없다.
        * 따라서 전체요소를 대상으로 연속 처리를 하고 싶을 때는 다음 방법을 사용한다.
        * /
         */
        //1. toArrayList
        Object[]arr= hset.toArray();
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);

        }

        //2. iterator() : 반복자를 사용하여 연속 처리 (가장 표준적인 방법/)
        //Iterator는 어떤 컬렉션이든 동일한 방식으로 순회활 수 있게 해주는 '반복자'객체
        Iterator<String>iter = hset.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next()); //다음 요소를 꺼냄
        }


    }
}
