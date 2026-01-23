package com.ExceptionHandling;

public class Throw11 {
    static void main(String[] args) {
        try {
    int age=15;
    if(age<18){
        throw  new ArithmeticException("not elgible for voting");
    }
            System.out.println("access granted");
        } catch (ArithmeticException e) {
            System.out.println("exception at: "+e.getMessage());

        }
    }
}
