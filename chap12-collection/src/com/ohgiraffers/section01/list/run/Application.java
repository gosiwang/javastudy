package com.ohgiraffers.section01.list.run;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        //ArrayList alist = new ArrayList();

        List alist = new ArrayList();
        alist.add("apple");
        alist.add(123);
        alist.add(45.6);
        alist.add(false);

        System.out.println("제네릭 없는 alist" + alist);

        //제네릭을 지정하지 않으면 리스트에 저장된 요소들이 OBJECT 타입으로 취급된다.
        String fruit = (String) alist.get(0);

        /*제네릭 사용 */
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("mango");
        stringList.add("orange");

        System.out.println(stringList);

        //오름차순 정렬
        Collections.sort(stringList);
        System.out.println("오름차순 정렬 후 : " + stringList);

        stringList.sort(Comparator.reverseOrder());
        System.out.println("내림차순 정렬 후 : " + stringList);

    }
}
