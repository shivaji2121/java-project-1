package com.ExceptionHandling;
class  ShivaException extends Exception{
    public  ShivaException(String str){
        super(str);
    }
}
public class CustomException {
    static void main(String[] args) {
        try {
            int age=14;
            if(age<18){
                throw  new ShivaException("This is my own exception okay 18+ content");
            }
        } catch (ShivaException e) {
            System.out.println("shivaji: "+e.getMessage());

        }
    }
}
