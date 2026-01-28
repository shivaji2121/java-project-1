package com.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface  Author{
    String name();
    int exp();
}

class parent2{
    @Author(name = "shivaji",exp = 1)
    public  void m1(){
        System.out.println("this is method one");
    }
}
public class CustomAnotaionsP1 {
    static void main(String[] args) {

    }
}
