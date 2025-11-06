package com.ohgiraffers.section01.list.run;

import com.ohgiraffers.section01.list.comparator.AscendingPrice;
import com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Application2 {
    public static void main(String[] args) {

        List<BookDTO> bookList = new ArrayList<>();

        bookList.add(new BookDTO(1,"홍길동전","허균",5000000));
        bookList.add(new BookDTO(3,"동의보감","허준",2000000));
        bookList.add(new BookDTO(2,"삼국사기","김부식",4000000));

        /*
        * */

        Collections.sort(bookList);

        System.out.println("오름차순 정렬");
        for(BookDTO book : bookList){
            System.out.println(book);
        }

        bookList.sort(new AscendingPrice());
        for(BookDTO book : bookList){
            System.out.println(book);
        }

        bookList.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                return Integer.compare(o2.getPrice(), o1.getPrice());
            }
        });
        for(BookDTO book : bookList){
            System.out.println(book);
        }

        /*람다식 사영 (제목 오름차순)*/
        /*인터페이스에 메소드가 하나만 있는 경우
        * 익명클래스 대신람다식을 상용하여 훨씬 간결하게코드를 작성할 수 있따.*/
        bookList.sort((b1,b2)->b1.getTitle().compareTo(b2.getTitle()));
        for(BookDTO book : bookList){
            System.out.println(book);
        }

    }
}
