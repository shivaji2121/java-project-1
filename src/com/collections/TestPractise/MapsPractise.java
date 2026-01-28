package com.collections.TestPractise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapsPractise {
    public static void main(String[] args) {
        mapPractise();
    }

    static void mapPractise() {
//        Map<Integer,String> map=new HashMap<>();
//        map.put(1,"shivaji");
//        map.put(2,"ram");
//        map.put(3,"kavya");
//        map.put(4,"keerthi");
//        map.put(5,"ayoyo");
//        map.put(6,"shivaji");
//        map.put(1,"one");
//        map.put(null,"null");
//        map.put(null,"hello");
//        System.out.println(map.get(null));
//        System.out.println(map.toString());
//        System.out.println("size: "+map.size());

//        Map<String,Integer> m1=new HashMap<>();
//        m1.put("a1",1);
//        m1.put("a1",2);
//        System.out.println(m1.toString());
//        System.out.println(m1.size());
        //tree map
//        Map<Integer, String> map = new HashMap<>();
//        map.put(1, "One");
//        map.put(2, "Two");
//        map.put(1, "Three");
//
//        System.out.println(map);
//        System.out.println(map.size());

        Map<String, String> map = new HashMap<>();
        map.put("python", "ml");
        map.put("javascript", "full stack");
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("python"));
        System.out.println(map.containsValue("ml"));
        System.out.println("ml--->"+map.get("python"));

        for (String keys : map.keySet()) {
            System.out.println(keys + " ");
        }

        for (Map.Entry<String ,String >e: map.entrySet()){
            System.out.println(e.getKey()+"---"+e.getValue());
        }


        Map<Integer, Integer> map1 = new HashMap<>();
        map1.put(10, 1);
        map1.put(20, 2);
        map1.put(30, 3);

//        for (Map.Entry<Integer, Integer> e : map1.entrySet()) {
//            if (e.getKey() == 20) {
//                map1.put(40, 4);
//            }
//        }
//        System.out.println(map1);

        Iterator<Map.Entry<Integer,Integer>> it=map1.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<Integer,Integer> e=it.next();
            if(e.getKey()==20){
                it.remove();
            }
        }
        System.out.println(map1);

    }
}
