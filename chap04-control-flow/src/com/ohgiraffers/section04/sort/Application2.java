package com.ohgiraffers.section04.sort;

import java.util.Arrays;

public class Application2 {
    public static void main(String[] args) {

        int[]arr={2,5,4,6,1,3};
        System.out.println("정렬 전" + Arrays.toString(arr));

        for(int i=0; i<arr.length-1;i++){
            int minIndex=i; //
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
            System.out.println((i+1)+"정렬 후: " + Arrays.toString(arr));
        }

    }
}
