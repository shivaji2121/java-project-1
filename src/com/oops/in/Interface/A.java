package com.oops.in.Interface;
interface A {
    int a=100;
    void show();
    void config();
}


class B implements A{
    public void show(){
        System.out.println("showing the area");
    }
    public  void config(){
        System.out.println("config");
    }
}
