package com.java8features;

@FunctionalInterface
interface Car {
    void drive(int speed, String carName);
}

public class FunctionalInterf {
    static void main(String[] args) {
        //lamda expression with anonomoyous function
//    Car c1=()-> System.out.println("driving now okay ");

//        Car c1 = (int speed, String name) -> {
//
//            if (speed > 100) {
//                System.out.println("speed dirivng " + name);
//            } else System.out.println("slow dirigving with car " + name);
//            System.out.println("driving now okay ");
//            System.out.println("welcome to new drivdr");
//        };
//        c1.drive(120, "Suv");
    }
}

