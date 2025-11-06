package com.ohgiraffers.section03.filterstream;

import java.io.*;

public class Application1 {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/com/ohgiraffers/section03/filterstream/testBuffered.txt"))) {
            bw.write("안녕하세요");
           bw.write("반갑습니다");
           //bw.flush() //버퍼가 다 차기 전에 강제로 내보내고 싶을 때 사용
            // 지금은 try-with-resources 구문을 사용하기 때문에 flush가 자동 실행된다.
            //close()를 호출하면 내부적으로 flush를 하고 나서 자원을 반납하기 때문.

        } catch (IOException e) {
            e.printStackTrace();
        }

        try(BufferedReader br = new BufferedReader(new FileReader("src/com/ohgiraffers/section03/filterstream/testBuffered.txt"))){
            /*readLine() : 버퍼의 한 줄을 읽어와서 문자열로 반환*/
            String temp;
            while((temp = br.readLine()) != null){
                System.out.println(temp);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}