package com.ohgiraffers.sesction02.demensinal;

public class Application2 {
    public static void main(String[] args) {
        int[][] iarr = new int[3][];

    iarr[0] = new int[3];
    iarr[1] = new int[3];
    iarr[2] = new int[3];

    int value= 1;

    for(int i=0;i<iarr.length;i++){
        for(int j=0;j<iarr[i].length;j++){
            iarr[i][j]=value++;
        }
    }
    }
}
