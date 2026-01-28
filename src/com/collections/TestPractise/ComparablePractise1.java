package com.collections.TestPractise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {//comparable for default soring okay if u want custom sorting means use comparable
    int id;
    String name;
    int marks;

    public Student() {
    }

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student s) {
        return this.marks - s.marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}

class myComparator implements Comparator<Student>{

    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

public class ComparablePractise1 {
    public static void main(String... args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(2, "shviaji", 90));
        list.add(new Student(3, "ravali", 60));
        list.add(new Student(4, "pravali", 99));
        list.add(new Student(5, "bangi", 50));
        list.add(new Student(1, "keerthi", 70));


        Collections.sort(list,(a,b)->Integer.compare(a.id,b.id));
        for (Student st:list){
            System.out.println(st);
        }

    Collections.sort(list,new myComparator());
        for (Student st:list){
            System.out.println("-->"+st);
        }
    }
}
