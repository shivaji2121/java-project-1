package com.ExceptionHandling;

public class Test1 {
    static void main(String[] args) {

      m1();
    }
    static void m1(){
        try {
            int a=10;
            try {
                System.out.println("inside the nested try block");
                int zero=0;
                int c=a/zero;
                System.out.println(c);
            }catch (Exception e){
                e.printStackTrace();
            }
        } catch (Exception e) {
            System.out.println("Please check the denominator it should not be zero"+e);
        }
    }
}
