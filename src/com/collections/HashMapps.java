package com.collections;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashMapps {
    static void main(String[] args) {
        hashMap();
    }

    static <Entry> void hashMap() {
        Map<Integer, String> m1 = new Hashtable<>();
        m1.put(1, "shivaji");
        m1.put(2, "shambaji");
        m1.put(3, "jai bhavani");
        m1.put(4, "kadhir");
        System.out.println(m1);
        Set<Integer> keys = m1.keySet();
        for (Integer key : keys) {
            System.out.println(key);
        }
        Collection <String> values=m1.values();
        for (String value:values){
            System.out.println(value);
        }

        Set <Map.Entry<Integer,String>> entries=m1.entrySet();
        for (Map.Entry<Integer,String> entry:entries){
            Integer key=entry.getKey();
            String value=entry.getValue();
            System.out.println(key+"-->"+value);
        }
        m1.put(3,"shivaji");
        m1.putIfAbsent(5,"hello");
//        m1.clear();
        System.out.println(m1.containsKey(6));
        System.out.println(m1);


    }
}
