package com.Streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Person {
    private int id;
    private String name;
    private int age;
    private char gender;
    private List<String> skills;

    public Person(int id, String name, int age, char gender, List<String> skills) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.skills = skills;
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

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", skills=" + skills +
                '}';
    }
}

public class StreamsPractise {

    static void main(String[] args) {
        List<Person> personList = List.of(
                new Person(1, "John", 25, 'M', List.of("Java", "Spring")),
                new Person(2, "Alice", 22, 'F', List.of("Python", "Django")),
                new Person(3, "Bob", 30, 'M', List.of("Java", "Docker")),
                new Person(4, "Diana", 18, 'F', List.of("HTML", "CSS")),
                new Person(5, "Mark", 35, 'M', List.of("Spring", "AWS"))
        );

//    personList.stream().
//            filter(person ->person.getName().toUpperCase().startsWith("A"))
//            .filter(person -> person.getGender()=='F')
//            .forEach(System.out::println);
//        personList.stream()
//                .map(person -> person.getName().toUpperCase())
//                .forEach(System.out::println);

//        personList.stream()
//                .map(p->p.getAge()+5)
//                .forEach(System.out::println);
//
//        List<Person> adults=personList.stream().filter(person -> person.getAge()>25).collect(Collectors.toList());
//        System.out.println(adults);

//        List<String> names=personList.stream().map(p->p.getName().toUpperCase()).collect(Collectors.toList());
//        System.out.println(names);
        personList.stream().filter(p -> p.getAge() > 25)
                .map(Person::getName)
                .forEach(System.out::println);

        long count = personList.stream()
                .filter(person -> person.getGender() == 'M')
                .count();
        System.out.println(count);


//        List<Person> list = personList.stream().
//                map(p -> new Person(p.getId(),
//                        p.getName(),
//                        p.getAge() + 1,
//                        p.getGender()))
//                .toList();
//        System.out.println(list);

        System.out.println("------avg age------");
        double avgAge = personList.stream()
                .mapToInt(Person::getAge)
                .average()
                .orElse(0);
        System.out.println(avgAge);

        Person oldest = personList.stream()
                .max(Comparator.comparingInt(Person::getAge))
                .orElse(null);
        System.out.println(oldest);

        System.out.println("----------------");
        Person minAge = personList.stream()
                .min(Comparator.comparingInt(Person::getAge))
                .orElse(null);
        System.out.println(minAge);

        System.out.println("------------");
        boolean isExist = personList.stream()
                .anyMatch(p->p.getGender() == 'F' && p.getAge()>17);
        System.out.println(isExist);

        System.out.println("-------------------");
        boolean allAdults=personList.stream().allMatch(p->p.getAge()>=18);
        System.out.println(allAdults);

        System.out.println("----------young------------");
        personList.stream()
                .sorted(Comparator.comparingInt(Person::getAge))
                .forEach(System.out::println);
        System.out.println("-------------------");
        personList.stream()
                .sorted(Comparator.comparingInt(Person::getAge).reversed())
                .forEach(System.out::println);

        System.out.println("---------------");
        personList.stream()
                .sorted(Comparator.comparingInt(Person::getAge).reversed())
                .limit(2)
                .forEach(System.out::println);

        System.out.println("-----------------");
        personList.stream()
                .sorted(Comparator.comparingInt(Person::getAge))
                .skip(2)
                .forEach(System.out::println);

        System.out.println("----------");
        Map<Character,List<Person>> grouped=personList.stream().collect(Collectors.groupingBy(Person::getGender));
        System.out.println(grouped);

        System.out.println("--------------");
        Map<Character,Long> countbygender=personList.stream()
                .collect(Collectors.groupingBy(
                        Person::getGender,
                        Collectors.counting()
                ));
        System.out.println(countbygender);

        System.out.println("--------all skills--------");
      Long cc=  personList.stream()
                .flatMap(p->p.getSkills().stream())
                .distinct()
                .count();

        System.out.println(cc);
    }
}
