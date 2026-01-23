package com.java8features;
class Hello{
    void show(){
        System.out.println("show method called");
    }
    void  print(){
        System.out.println("print method called");
    }
}

abstract class Abclass{
    public void  show(){
        System.out.println("implement the abs show method");
    }
    public abstract  void printin();
}
public class OuterClass {
    public static void main(String[] args) {
    Hello h1=new Hello(){
        void  print(){
            System.out.println("print method called with onfly modification");
        }
    };
    h1.print();

    Abclass ab=new Abclass() {
        @Override
        public void printin() {
            System.out.println("guntur");
        }
    };
    ab.printin();
    }
}
