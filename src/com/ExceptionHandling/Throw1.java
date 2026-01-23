package com.ExceptionHandling;

public class Throw1 {
    static void main(String[] args) {
        int age=15;
        if(age<18){
            throw  new ArithmeticException("Age should be greater than 18");
        }
        System.out.println("elgible for voting");
    }
}
