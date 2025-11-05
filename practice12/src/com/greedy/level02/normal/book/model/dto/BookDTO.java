package com.greedy.level02.normal.book.model.dto;

public class BookDTO {
    private String title;
    private String publisher;
    private String author;
    private int price;
    private double discountRate;

    public BookDTO() {}
    public BookDTO(String title, String publisher, String author) {
        this.title = title;
        this.publisher = publisher;
        this.author = author;

    }
    public BookDTO(String title, String publisher, String author, int price, double discountRate) {
        this.title = title;
        this.publisher = publisher;
        this.author = author;
        this.price = price;
        this.discountRate = discountRate;
    }


    public void printInformation() {
        System.out.print( title+", ");
        System.out.print( publisher+", ");
        System.out.print( author+", ");
        System.out.print( " " +price+", " );
        System.out.print( " "+discountRate);
        System.out.println();

    }
}
