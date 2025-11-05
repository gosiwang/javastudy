package com.ohgiraffers.section03.copy;

import java.util.Arrays;

public class Application3 {
    public static void main(String[] args) {

        int[]arr={1,2,3,4,5};

        // vlaue는 임시 변수이기 때문에
        for(int value:arr){
            value+=10;
            System.out.println("임시 변수 value의 값: "+value);
        }
        System.out.println(Arrays.toString(arr));

        for(int i=0; i<arr.length;i++){
            arr[i]+=10;
        }
        System.out.println(Arrays.toString(arr));
    }
}
