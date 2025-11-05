package com.greedy.level02.normal.book.run;

import com.greedy.level02.normal.book.model.dto.BookDTO;

public class Application extends BookDTO {
    public static void main(String[] args) {
        BookDTO bto = new BookDTO();

        bto.printInformation();

        BookDTO bto2 = new BookDTO("자바의 정석","도우출판","남궁성");

        bto2.printInformation();

        BookDTO bto3 = new BookDTO("홍길동전","활빈당","허균",5000000, 0.5);
        bto3.printInformation();
    }
}
