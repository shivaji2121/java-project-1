package com.Comparator;

import java.util.*;

class Student implements Comparable<Student> {
    int id;
    String name;
    int marks;
    int mathMarks;
    int physicsMarks;

    public Student(int id, String name, int marks, int mathMarks, int physicsMarks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.mathMarks = mathMarks;
        this.physicsMarks = physicsMarks;
    }


    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name='" + name + '\'' + ", marks=" + marks + ", mathMarks=" + mathMarks + ", physicsMarks=" + physicsMarks + '}';
    }

    //    @Override
//    public int compareTo(Student student) {
//        int x=this.id;
//        int y=student.id;
//        return (x < y) ? -1 : ((x == y) ? 0 : 1);
//    }
    @Override
    public int compareTo(Student student) {
        return Integer.compare(student.id, this.id);
//            return  student.name.compareTo(this.name);
    }
}

public class Comparatorrr {
    static void main(String[] args) {
        Integer arr[] = {2, 3, 4, 1, 6, 7};
//        Comparator<Integer> comp = (Integer x, Integer y) ->(x < y) ? 1 : ((x == y) ? 0 : -1);
//        Comparator<Integer> comp = (Integer x, Integer y) ->Integer.compare(x,y);
//        Arrays.sort(arr,comp);
//        Comparator <Integer> comp=Comparator.comparingInt((Integer i)->i).reversed();
//        Arrays.sort(arr,comp);
//        System.out.println(Arrays.toString(arr));
        removeif();
        Comparator<Student> studentComparator = (s1, s2) -> s1.name.compareTo(s2.name);
        Comparator<Student> stComp = Comparator.comparing(s -> s.name, Comparator.nullsFirst(Comparator.naturalOrder()));
        Comparator<Student> mathMarks = Comparator.comparing((s) -> s.mathMarks);
        Comparator<Student> physicsMarks = Comparator.comparing((s) -> s.physicsMarks);
        Comparator<Student> marks = Comparator.comparing((s) -> s.marks);
        Student[] students = {new Student(1, "b.shiva", 74, 50, 90),
                new Student(2, "asghar", 56, 40, 60),
                new Student(6, "ram", 90, 50, 90),
                new Student(10, "hello", 56, 40, 60),
                new Student(4, "rao", 56, 40, 100),
                new Student(5, "rasi", 90, 90, 50),
                new Student(8, null, 56, 60, 10),};

//        Arrays.sort(students,studentComparator.reversed());
//        Arrays.sort(students,stComp.reversed());
        List<Student> slist = new ArrayList<>(Arrays.asList(students));
        Collections.sort(slist, physicsMarks.thenComparing(mathMarks).thenComparing(marks).reversed());


        System.out.println("--->" + slist);


    }

    static void sortarr() {
        Integer arr[] = {2, 3, 4, 1, 6, 7};
//        Arrays.sort(arr);
////        System.out.println(Arrays.toString(arr));
//        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
//        Collections.sort(list);
//        System.out.println(list);


    }
    static  void removeif(){
        List<String> list=new ArrayList<>();
        list.addAll(List.of("hello","shiva","super","hai"));
        list.removeIf((e)->e.equalsIgnoreCase("super"));
        System.out.println(list);
    }
}
