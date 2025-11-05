package com.ohgiraffers.sesction02.demensinal;

public class Application1 {
    public static void main(String[] args) {

        int [][] iarr = new int[3][5];

        int value =1;
        for(int i=0; i< iarr.length; i++){
            for(int j=0; j<iarr[i].length; j++){
                iarr[i][j]=value++;
            }
        }
        for(int i=0; i< iarr.length; i++){
            for(int j=0; j<iarr[i].length; j++){
                System.out.println(iarr[i][j]+ "");
            }
        }
        System.out.println();
    }
}
