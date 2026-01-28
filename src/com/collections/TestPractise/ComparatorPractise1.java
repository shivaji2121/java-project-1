package com.collections.TestPractise;

import java.util.Comparator;

class CustomComparator implements Comparator<Student>{

    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

public class ComparatorPractise1 {
    public static void main(String[] args) {

    }
}
