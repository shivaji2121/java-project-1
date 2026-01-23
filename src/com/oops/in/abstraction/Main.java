package com.oops.in.abstraction;

public class Main {
    static void main(String[] args) {
        System.out.println("inside main");
        Shape t1=new Traingle();
        t1.hello();
        t1.area();
        t1.draw();
    }
}
