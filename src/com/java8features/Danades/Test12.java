package com.java8features.Danades;

import com.JavaBasics.in.A;

interface Animal {
    public void eat();

    public void sleep();

    default void walk() {
        System.out.println("walking");
    }
}

class dog implements Animal {

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
        dog dog = new dog();
        dog.eat();
        dog.sleep();
        dog.walk();
        Demo d1 = (a, b) -> {
            System.out.print("sum: ");
            System.out.println(a + b);
        };
        Demo d2 = (a, b) -> System.out.println("welcome " + (a + b));
        d1.test(10, 20);
        d2.test(10, 20);
        d1.show();
        Demo.m1();

        Test test = name -> System.out.println("hello " + name);
        test.m1("shivaji");

        Demo1 demo1=(a,b)->{
            int sum=a+b;
            return sum;
        };
        int sum=demo1.m1(12,12);
        System.out.println("sum: "+sum);

        Demo1 demo2=(a,b)->a+b;

       int sum2= demo2.m1(10,20);
        System.out.println(sum2);
    }
}
