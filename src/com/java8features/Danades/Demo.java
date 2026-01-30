package com.java8features.Danades;

@FunctionalInterface
interface Demo {
    void test(int a,int b);
    default void  show(){
        System.out.println("welcome to spring boot");
    }
    static void m1(){
        System.out.println("hello calling");
    }
}


@FunctionalInterface
interface Test{
    void m1(String str);
}

@FunctionalInterface
interface Demo1{
    int m1(int str,int x);
}