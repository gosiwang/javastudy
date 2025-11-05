package com.ohgiraffers.sesction02.demensinal;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {

        int[][] subj= new int[3][3];

        Scanner sc=new Scanner(System.in);
        String [] name=new String[3];

        String[] gr =new String[3];
        gr[0]="국어";
        gr[1]="수학";
        gr[2]="영어";
        for(int i=0;i<subj.length;i++){
            System.out.print("이름을 입력하세요: ");
            name[i]=sc.next();
            for(int j=0;j<subj[i].length;j++){


                System.out.print(gr[j]+"성적을 입력하세요: ");
                subj[i][j]=sc.nextInt();

            }

        }

        for(int i=0;i<subj.length;i++){
            int sum=0;
            int avg=0;
            for(int j=0;j<subj[i].length;j++){
                sum+=subj[i][j];

            }
            avg=sum/subj[i].length;
            System.out.println(name[i] + "의 총점은 " + sum + "이고 평균은 " + avg + "이다 ");
        }
    }
}
