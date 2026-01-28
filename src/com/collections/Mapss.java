package com.collections;

import java.util.*;


public class Mapss {
    static void main(String[] args) {
        hashTable();
    }

    static void hashTable() {
        Map<Integer, String> m1 = new HashMap<>();
        m1.put(180397, "shiva prasad");
        m1.put(180949, "kavya");
        m1.put(180347, "keerthi");
        m1.put(180940, "kavya");
        m1.put(180348, "keerthi");

        System.out.println(m1.size());
        System.out.println(m1);
//        m1.clear();
        System.out.println(m1);
//        Set<Map.Entry<Integer, String>> entries = m1.entrySet();
//        for (Map.Entry<Integer, String> entry : entries) {
//            Integer key = entry.getKey();
//            String value = entry.getValue();
//            System.out.println(key + ">>" + value);
//        }

        Set<Map.Entry<Integer,String>>entries=m1.entrySet();
        for (Map.Entry<Integer,String> e:entries){
            Integer key=e.getKey();
            String value=e.getValue();
            System.out.println(key+"--"+value);
        }
        System.out.println(m1);
        m1.putIfAbsent(180940,"kavay madam");
        m1.replace(180347,"mumbai");
        System.out.println(m1);


        m1.remove(180397);
        System.out.println(m1.containsKey(180397));
        System.out.println(m1.containsValue("keerthi"));


//
//        Set<Integer> keys= m1.keySet();
//        for(Integer key:keys){
//            System.out.println(key);
//        }
//        Collection<String> values= m1.values();
//        System.out.println();
//        for(String value:values){
//            System.out.println(value);
//        }
//        System.out.println(m1.get(180397));

//        Set <Integer> keys=m1.keySet();
//        for (Integer key:keys){
//            System.out.println(key+">>>"+m1.get(key));
//        }
    }

    static void hashMap(){}



}
