package com.ohgiraffers.section05.parameter;

public class Rectangle {

    private double width;
    private double height;

    public Rectangle(double width,double height){
        this.width=width;
        this.height=height;

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void printInfo(){
        System.out.println("width = " + this.width + ", height = " + this.height);

    }

    /*객체 (참조 자료형) : 파라미터로 '주솟값'이 복사되어 넘어온다. (얕은 복사)*/

}
