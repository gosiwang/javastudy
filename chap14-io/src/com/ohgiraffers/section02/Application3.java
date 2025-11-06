package com.ohgiraffers.section02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application3 {
    public static void main(String[] args) {
        /*fILEreader:
        * */
        try(FileReader fr = new FileReader("src/com/ohgiraffers/section02/testReader.txt")){
            int value;
            while((value = fr.read()) != -1){
                System.out.println((char)value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
