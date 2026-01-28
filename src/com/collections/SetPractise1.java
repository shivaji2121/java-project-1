package com.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetPractise1 {
    public static  void main (String...args){
        TreeSet<String> set=new TreeSet<>();
        set.add("Hello");
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple");
//        set.add(null);
//        set.add(null);

        System.out.println("set: "+set.toString());
        for (String ele:set){
            System.out.println(ele);
        }
        Iterator<String> it= set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        set.stream().forEach(System.out::println);
    }
}
