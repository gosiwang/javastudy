package com.ohgiraffers.section03.abstraction;

public class CarRacer {

    private final Car myCar = new Car();

    public void startUp(){

        myCar.startUp();
    }
    public void stepAccelator(){
        myCar.go();
    }

    public void stepBreak(){
        myCar.stop();
    }

    public void trunoff(){
        myCar.turnoff();
    }
}
