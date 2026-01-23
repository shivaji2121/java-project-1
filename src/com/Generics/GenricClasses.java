package com.Generics;
interface  GInteraface<E>{
    void setValue(E e);
    void getValue();
}

public class GenricClasses {
    static void main(String[] args) {
        GenClass<String, String> g1 = new GenClass<>("one", "btm layout");
        System.out.println(g1.getKey());
        System.out.println(g1.getValue());

        GenClass<Integer, String> g2 = new GenClass<>(1, "btm layout");
        System.out.println(g2.getKey());
        System.out.println(g2.getValue());

    }
}

class GenClass<K, V> {
    K key;
    V value;

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public GenClass(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
