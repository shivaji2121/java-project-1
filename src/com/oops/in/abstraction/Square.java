package com.oops.in.abstraction;

public class Square extends Shape{
    @Override
    void area() {
        System.out.println("side * side");
    }

    @Override
    void draw() {
        System.out.println("drawing square shape");
    }
}
