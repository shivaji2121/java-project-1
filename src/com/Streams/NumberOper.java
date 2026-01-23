package com.Streams;

import java.util.Comparator;
import java.util.List;

public class NumberOper {

    static void main(String[] args) {
        List<Integer> list= List.of(1,2,2,3,4,5,6,0,30,40,50,60,70,80,7,8,9,10);
       Long cou=list.stream().count();
        System.out.println(cou);

        List<String> emp=List.of("shiva","ram","nikitha","praneeth","swarna mukhi");

    }
}
