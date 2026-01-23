package com.collections;

import java.util.*;

public class Hashseett {
    static void main(String[] args) {
//        hashset();
//        hashIterator();
//        unmofiableSet();
//        linkedhashSet();
//        treeSet();
//        enumset();
//        sorthashset();
//        treeSortReverse();
        hashIterator();
    }

    static void hashset() {
        Set<String> s1 = new HashSet<>();
        s1.add("shivaji");
        s1.add("kavya");
        s1.add("pravali");
        s1.add("supriya");
        s1.add("kavya");
        s1.add(null);

        for (String name : s1) {
            if (name != null) System.out.println(name);
        }

        System.out.println(s1);
    }

    static void hashIterator() {
        Set<String> s1 = new HashSet<String>();
        s1.add("shivaji");
//        s1.addA("ram", "keerthi", "ravi", "rajesh", "hemanth", "ashok"));
//        s1.clear();/**/


        Iterator<String> it = s1.iterator();
        while (it.hasNext()) {
            String n = it.next();
            if(n=="ashok"){
                it.remove();  // 1, 2, 3
            }
            System.out.println("-->" + n);
        }

        System.out.println(s1);
        System.out.println(s1.size());
        System.out.println("----");
        Spliterator<String> spl = s1.spliterator();
        spl.forEachRemaining(System.out::println);

    }

    static void unmofiableSet() {
        Set<String> s1 = new HashSet<String>();
        s1.add("shivaji");
        s1.addAll(Set.of("ram", "keerthi", "ravi", "rajesh", "hemanth", "ashok"));
//        Set<String> s2= Collections.unmodifiableSet(s1);
//        s1.add("hell");
//        System.out.println(s1);
//        s2.add("welcome");
//        System.out.println(s2);
        s1.forEach((name) -> System.out.println(name));
    }

    static void linkedhashSet() {
        Set<Integer> lhs = new LinkedHashSet<>();
        lhs.add(1);
        lhs.add(100);
        lhs.add(2);
        lhs.add(5);
        System.out.println(lhs);
        lhs.add(100);
//        lhs.forEach((e)-> System.out.println(e));

        if (lhs.contains(100)) {
            lhs.remove(100);
        }
        System.out.println(lhs);
        for (Integer i : lhs) {
            System.out.println(i);
        }


    }

    static void treeSet() {
        NavigableSet<Integer> ts = new TreeSet<>();
        ts.add(90);
        ts.add(20);
        ts.add(40);
        ts.add(50);
        ts.add(400);
        System.out.println(ts);
        System.out.println("ceiling-->" +ts.ceiling(36));
        System.out.println("floor-->"+ts.floor(54));
        System.out.println("Nearest value greater than 76 in the Set- "
                + ts.higher(76));
        System.out.println("Nearest value less than 8 in the Set- "
                + ts.lower(21));

    }
    static  void enumset(){
        enum Day {
            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
        }
            EnumSet<Day> weekend=EnumSet.of(Day.SATURDAY,Day.SUNDAY);
        System.out.println("is monday is weekedn: "+weekend);
        System.out.println("Is MONDAY weekend? " + weekend.contains(Day.MONDAY));

        EnumSet<Day> workdays = EnumSet.complementOf(weekend);
        System.out.println("Workdays: " + workdays);

        EnumSet<Day> days = EnumSet.allOf(Day.class); // All enum values
        System.out.println("All days: " + days);

        EnumSet<Day> midWeek = EnumSet.range(Day.TUESDAY, Day.THURSDAY);
        System.out.println("Midweek: " + midWeek);


        days.remove(Day.SUNDAY);
        System.out.println("Days after removing SUNDAY: " + days);

        System.out.println("Is days empty? " + days.isEmpty());
        System.out.println("Size of days set: " + days.size());

    }
    static void sorthashset(){
        Set<Integer> s1=new HashSet<>();
        s1.addAll(Set.of(2,3,5,6,7,8100,1,0));
        System.out.println(s1);

        List<Integer> list=new ArrayList<>(s1);
        Collections.sort(list);
        System.out.println(list);

        Set<Integer> s2=new TreeSet<>(s1);
        System.out.println("-->"+s2);

    }
    static void treeSortReverse(){
        Set<Integer> s1=new TreeSet<>(new CompareValues()) ;
        s1.addAll(Set.of(3,10,1,20,40,60));
        System.out.println(s1.hashCode());
    }
}

class  CompareValues implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return  o2.compareTo(o1);
    }
}