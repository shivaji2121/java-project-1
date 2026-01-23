package com.collections;

import java.util.*;

public class VectorV1 {
    static void main(String[] args) {
        asList();
    }

    static void vector() {
        Vector<String> v = new Vector<>();

        v.add("raj");
        v.add("shiva");
        v.add("ram");

        Vector<String> v2 = new Vector<>(20);

        v2.add("hii");
        v2.add("kkk");
//        System.out.println(v);
//        v.addAll(0,v2);
//        System.out.println(v);
//        System.out.println(v.size());
//        System.out.println(v.capacity());
//        System.out.println(v.get(2));
////        v.remove("raj");
////        v.removeAll(v2);
////        v.clear();
////        v2.clear();
//        System.out.println(v);
//        System.out.println(v.contains("ram"));
        System.out.println(v2);
        v2.add("romeo");
        v2.set(1, "sathish");
        System.out.println(v2);
        System.out.println(v2.lastIndexOf("sathish"));
        System.out.println(v2.capacity());
    }

    static void asList() {
        List<Integer> l1 = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            l1.add(i);
        }
        for (int i = 1; i <= 5; i++) {
            l1.add(i);
        }

        for (int i = 5; i >=0; i--) {
            l1.add(i);
        }
        System.out.println(l1);
//        l1.sort(null);
        l1.sort(Comparator.naturalOrder());
        l1.sort(Comparator.reverseOrder());
//        Collections.sort(l1);
        System.out.println(l1);

//        List <Integer> l2=new ArrayList<>();
//        for(Integer i:l1){
//            if(!l2.contains(i)){
//                l2.add(i);
//            }
//        }
//        for (Integer i: l1){
//            System.out.println(i);
//        }

//        Set <Integer> s1=new HashSet<>(l1);
//        System.out.println(s1);


    }
}
