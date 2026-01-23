package com.javaBasicss;

public class TypeCasting {
    int i=10;
    float j=i;
void Print(){
    System.out.println(i+"-----"+j);
}
}

class  A{
    void  Print(){
        System.out.println("inside Class A");
    }
    void hello(){
        System.out.println("hello this is shivaji");
    }
}
class  B extends A{
    void Print(){
        System.out.println("inside the class B");
    }
}
