package com.oops.in.inheritance;

public class Main {
    static void main(String[] args) {
//        Shapes shapes=new Shapes();
//        Triangle tr=new Triangle();
//        Rectangle rectangle=new Rectangle();
//        tr.area();
//        rectangle.area();

//        Shapes square= new Square();
//        square.area();

        //static polymorphism or compile time polymorphism
//        Numbers obj=new Numbers();
//        System.out.println( obj.sum(10.98439,2));

        Encapsulation bean=new Encapsulation();
        bean.setId(1);
        bean.setSalary(20800);
        bean.setName("shivaji");

        System.out.println("New Employee: "+bean);
    }
}
