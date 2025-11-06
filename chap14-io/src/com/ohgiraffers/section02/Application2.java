package com.ohgiraffers.section02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application2 {
    public static void main(String[] args) {
        /*
        * FileOutPutStream : 데이터를 1바이트씩 파일에 출력하는 스트림
        * */
        //try
        try(FileOutputStream fout = new FileOutputStream("src/com/ohgiraffers/section02/testOutputStream.txt")){
            // 1. 1바이트씩 쓰기
            fout.write(97);


            //byte 배ㅕㅇ를 이욯서 한번에 기록할 수 있다.
                        byte [ ]bar = new byte[] {97,99,100,100,102};
                        fout.write(bar);
                        fout.write(bar,1,3);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
           e.printStackTrace();
        }
    }
}
