package com.ohgiraffers.section02.set;

import com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.Set;
import java.util.TreeSet;

public class Application3 {
    public static void main(String[] args) {
        /*
        * TreeSet
        * - '중복 불가'의 특징과 함계, 요소를 저장할 때마다 자동으로 오름차순 정렬을 해준다.
        *
        * 자동 정렬의 비밀
        * -TreeSet에 추가되는 요소는 반드시 'Comparable'인터페이스를 구현하고 있어야 한다.
        * String, Integer 등의 기본자료형 Wrapper 클래스들은 아마 'Comparablaㅇ이 구현되어있어 자동 정렬된다.
        * */

        TreeSet<String> tset = new TreeSet<>();
        tset.add("java");
        tset.add("html");
        tset.add("mysql");
        tset.add("css");
        tset.add("java");

        System.out.println("tset : " + tset);
        Set<BookDTO> bookSet = new TreeSet<>();
        bookSet.add(new BookDTO(2,"목민심서","정약용",40000));
        bookSet.add(new BookDTO(3,"홍길동전","허균",42000));
        bookSet.add(new BookDTO(1,"동의보감","허준",44000));

        System.out.println("bookSet : " );
        for(BookDTO book : bookSet){
            System.out.println(book);

        }
        Set<Integer> lotto = new TreeSet<>();
        while(lotto.size()<6){
            lotto.add((int)((Math.random()*45)+1));
        }
    }
}
