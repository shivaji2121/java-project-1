package com.collections.TestPractise;

import java.util.LinkedList;

public class LinkedListP1 {
    static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        list.addFirst(4);
        list.addFirst(40);
//        list.removeFirst();
//        list.removeLast();
        System.out.println(list.toString());
        System.out.println(list.peek());
        System.out.println(list.poll());
        System.out.println(list.pop());
    }
}
