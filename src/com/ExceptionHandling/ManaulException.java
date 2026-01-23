package com.ExceptionHandling;

public class ManaulException {

     static void main(String[] args) {
    try{
        int age=14;
        if(age<18){
            throw new ArithmeticException("Age must be 18+");
        }
    }catch (ArithmeticException e){
        System.out.println("exception at: "+e.getMessage());
    }

    }

}
