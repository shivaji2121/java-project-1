package com.Generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Generics {
    static void main(String[] args) {
        ArrayList<Pair<String, Integer>> busroutes = new ArrayList<>();
        busroutes.add(new Pair("hello", 103));
        busroutes.add(new Pair("Dislshuk nagar", 123));
        System.out.println(busroutes);

        List<String> list = new ArrayList<>();
        list.add("shivaji");
        list.add("1");
        list.add("hyd");
        Iterator <String>it = list.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(" " + str);
        }
    }
}

class Pair<K, V> {
    K key;
    V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
