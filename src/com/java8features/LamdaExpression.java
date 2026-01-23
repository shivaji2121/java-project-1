package com.java8features;

import java.util.*;

class Person{
    private  int id;
    private String name;
    private  int age;
    private char gender;

    public Person(int id, String name, int age, char gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}

@FunctionalInterface
interface  MyInterface{
    Person getRef(int id,String name,int age,char gender);
}
class LamdaExpression {
    public static void main(String[] args) {
        List<Person> personList=createList();
        Collections.sort(personList, new Comparator<Person>() {
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println("Sorted list with anonymous implementation");
        for(Person p : personList){
            System.out.print(p.getName() + " ");
        }

        personList = createList();

        Collections.sort(personList,(Person a,Person b)->a.getName().compareTo(b.getName()));
        System.out.println("Sorted list with lambda implementation");
        personList.forEach((per)->{
            System.out.println(per);
        });

        System.out.println("-------------");
        List<String> list= Arrays.asList("shiva","ravi","raji","rakhi");
        list.forEach(name->greet(name));
    }

    private static List<Person> createList() {
        List<Person> tempList=new ArrayList<Person>();
        MyInterface createObj=Person::new;
        Person person = createObj.getRef(1,"Tiwari", 50, 'M');
        tempList.add(person);
        person = createObj.getRef(2, "Chopra", 13, 'M');
        tempList.add(person);
        person = createObj.getRef(3, "Trivedi", 30, 'F');
        tempList.add(person);
        person = createObj.getRef(3, "Sharma", 40, 'M');
        tempList.add(person);
        System.out.println("List elements are - ");
        System.out.println(tempList);
        return tempList;
    }

    static void greet(String name){
        System.out.println("hello  "+name);
    }
}

