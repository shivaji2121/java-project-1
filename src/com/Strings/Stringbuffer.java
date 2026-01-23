package com.Strings;

import java.util.StringJoiner;

public class Stringbuffer {
    static void main(String[] args) {
//      StringBuffer sb=new StringBuffer("racecar");
      StringBuilder sb=new StringBuilder("racecar");
//      sb.append(9098.08);
//        sb.insert(1,398783.90);
//        sb.replace(0,2,"shivaji");
//        sb.delete(0,2);
        sb.reverse();
        System.out.println(sb.substring(2,5));
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());

        String s1="h e l l o ";
        System.out.println(s1.replaceAll(" ","o"));

        s1.substring(3);
        System.out.println("--"+s1.substring(3));
        String s2="hello";
        s2="welcome to nodejs";
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        if(s1==s2){
            System.out.println("both address are same");
        }
        else
            System.out.println("not same");



    }
}
