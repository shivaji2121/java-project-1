package com.MethodRefereces;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
    static void main(String[] args) {
        List<String> list= Arrays.asList("shiva","kadhir vel","ram");
//        list.forEach(new Test()::greet);//name->greet(name)
//        list.forEach(System.out::println);
        list.forEach(String::toUpperCase);
       list.stream().map(String::toUpperCase).forEach(System.out::println);
        Collections.sort(list,String::compareTo);
        list.forEach(System.out::println);
        List<Student> students=list.stream().map(Student::new).toList();
        System.out.println(students);

    }
    void greet(String name){
        System.out.println("hello  "+name);
    }

}
class  Student{
    String name;

    public Student(String name) {
        this.name = name;
        System.out.println(name);
    }
}
