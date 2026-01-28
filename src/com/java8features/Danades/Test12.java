package com.java8features.Danades;

import com.JavaBasics.in.A;

interface Animal{
    public void eat();
    public void sleep();
    default void walk(){
        System.out.println("walking");
    }
}
class dog implements Animal{

    @Override
    public void eat() {
        System.out.println("eating");
    }

    public void sleep() {
        System.out.println("sleep");
    }
//    @Override
//    public void walk(){
//        System.out.println("walking");
//    }
}

public class Test12 {
    static void main(String[] args) {
    dog dog=new dog();
    dog.eat();
    dog.sleep();
    dog.walk();
    }
}
