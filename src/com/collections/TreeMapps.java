package com.collections;

import java.util.TreeMap;

public class TreeMapps {
    static void main(String[] args) {
        TreeMap <Integer,String> tmap=new TreeMap<>();
        tmap.put(90,"spring boot");
        tmap.put(100,"core java");
        tmap.put(40,"jsp");
        tmap.put(110,"servlets");
        tmap.put(95,"struts");
        tmap.put(45,null);
        tmap.put(45,"hibernate");
        tmap.put(50,"spring");
        tmap.put(200,null);
        tmap.entrySet().forEach((e)-> System.out.println(e.getKey()+","+e.getValue()));
        System.out.println(tmap);
    }
}
