package com.collections;

import java.util.Iterator;
import java.util.List;
import  java.util.ArrayList;

public class Arraylist {
    static void main(String[] args) {
        arrList();
        arrIterator();
    }

    static void arrList() {
        List<Integer> list = new java.util.ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        System.out.println(list.hashCode());
        list.add(4);
        list.add(5);
        list.add(null);
        list.add(null);
        for (Integer x : list) {
            if (x == null) {
                list.remove(x);
            }
            System.out.println(x);
        }
//        list.clear();//clears list
//        list.remove(5);
//        list.remove();
        System.out.println(list);
    }
    static  void arrIterator(){
        List <String> list=new ArrayList<>();
        list.add("web app");
        list.add("Rest apis");
        list.add("mobile app");
        list.add("spring boot");
        list.add(null);

        Iterator<String> it=list.iterator();
        System.out.println(list);
        while(it.hasNext()){
            String obj=it.next();
            if(obj==null){
                it.remove();
            }
            System.out.println(obj);
        }
        System.out.println(list);
    }
}
