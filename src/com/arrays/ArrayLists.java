package com.arrays;
import  java.util.ArrayList;

public class ArrayLists {
    static void main(String[] args) {
    Array1();
    }

    static  void Array1(){
        ArrayList<Integer> list=new ArrayList<>();

        list.add(1);
        list.add(100);
        ArrayList<Integer> list2 = new ArrayList<>();
        list.add(1111);
        list.add(10000);
        list.addAll(list2);

        System.out.println(list);
    }
}
