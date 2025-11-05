package com.ohgiraffers.section03.copy;

import java.util.Arrays;

public class Application2 {
    public static void main(String[] args) {

        int[] originArr = {1, 2, 3, 4, 5};
        System.out.println("originArr : " + originArr.hashCode());
        System.out.println("---------------------------------");
        ;

        int[] copyFor = new int[originArr.length];
        for (int i = 0; i < originArr.length; i++) {
            copyFor[i] = originArr[i];
        }
        print("copyFor",copyFor);

        int[]copyof= Arrays.copyOf(originArr,originArr.length);
        int[]arrayCopy= new int[originArr.length];
        System.arraycopy(originArr,0,arrayCopy,0,originArr.length);
        print("arrayCopy",arrayCopy);
        int[]copyClone = originArr.clone();
        print("copyClone",copyClone);

        copyClone[0]=99;
        print("originArr",originArr);
        print("copyClone",copyClone);
    }

    public static void print(String name, int[] arr){
        System.out.println(name + "hashCode: " + arr.hashCode() + ", array: " + Arrays.toString(arr));

    }

    }

