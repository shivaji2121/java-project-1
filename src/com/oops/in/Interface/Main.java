package com.oops.in.Interface;
class X{
    static {
        System.out.println("inside the static block");
    }
    {
        System.out.println("inside initialisation block");
    }
    X(){
        System.out.println("inside the constructor");
    }

}

public class Main {
    static void main(String[] args) {
//    Inter1 obj1=new A();
//    obj1.hello();
//        Hello h=new Hello();
//        h.m1();
//        h.m2();
//        B obj=new B();
//        obj.config();
//        obj.show();
//        System.out.println("A.a: "+A.a);

        System.out.println("after");
        X obj= new X();
        System.out.println("Before");

    }
}
