package com.ohgiraffers.section03.abstraction;

import java.sql.SQLOutput;

public class Car {

    private boolean isOn;
    private int speed;

    public void startUp(){
        if(isOn) {
            System.out.println("Car is already on");

        }else {
            this.isOn = true;
            System.out.println("Car is on 시동검");
        }
    }

    public void go(){
        if(isOn) {
            System.out.println("자기 앞으로 움직입니다.");
            this.speed+=10;
            System.out.println("현재 시속은 " + this.speed + "km/h 입니다." );

        }else{
            System.out.println("시동을 먼저 걸어주세요");
        }
    }

    public void stop(){
        if(isOn) {
            if(this.speed>0) {
                this.speed=0;
                System.out.println("차가 서서히 멈춥니다.");
            }else {
                System.out.println("c차는 이미멈춰");
            }
        }else {
            System.out.println("시동이 걸려있지 않습니다.");
        }
    }

    public void turnoff(){
        if(isOn) {
            if(this.speed>0) {
                System.out.println("차를 먼저 멈춰주세요");

            }else {
                this.isOn=false;
                System.out.println("시동을 겁니다.");
            }
        }else{
            System.out.println("이미 시동이 꺼져있습니다.");

        }
    }
}
