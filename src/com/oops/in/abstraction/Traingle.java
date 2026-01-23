package com.oops.in.abstraction;

public  class Traingle extends Shape{
    @Override
    void draw(){
        System.out.println("drawing area of triangle");
    }

    @Override
    void area() {
        System.out.println("half * b * h = triangle area");
    }

    void hello(){
        System.out.println("hello shivaji pls take risk triangle");
    }
}
