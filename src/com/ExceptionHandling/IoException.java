package com.ExceptionHandling;
import  java.io.IOException;

public class IoException {
    static  void readFile() throws  IOException{
        throw  new IOException("file not found");
    }
    static void main(String[] args) {
    try{
        readFile();
    } catch (IOException e) {
        System.out.println(e.getMessage());
    }
    }
}
