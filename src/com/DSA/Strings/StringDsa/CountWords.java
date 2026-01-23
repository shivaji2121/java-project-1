package com.DSA.Strings.StringDsa;

public class CountWords {
    static void main(String[] args) {
        countWords(" welcome to nodejs hello   welcome  hello hello   ");
    }

    static void countWords(String str) {
        str = str.trim();
        String st = str.replaceAll("\\s+", " ");
        int count=0;
        if(!st.isEmpty()){
            count=st.split(" ").length;
        }
        System.out.println(count);


    }
}
