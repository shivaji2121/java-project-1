package com.DSA.Strings.StringDsa;

public class ReverseString {
    public static void main(String[] args) {
        String str = "racecar";
        char[] s1 = str.toCharArray();
//        boolean b1 = palindrome("racecar");
//        System.out.println(b1);
//        if (b1) {
//            System.out.println("palindrome");
//        } else {
//            System.out.println("not palindrome");
//        }

//        palindromeTwoPointers(s1);
       String st1= reverseVowels("hello");
        System.out.println("str: "+st1);


    }

    static void reverse(char[] charArr) {
        int start = 0;
        int end = charArr.length - 1;
        while (start < end) {
            char temp = charArr[start];
            charArr[start] = charArr[end];
            charArr[end] = temp;
            start++;
            end--;
        }
        System.out.println(charArr);
    }

    static boolean palindrome(String str) {
        int start = 0;
        int n = str.length() - 1;
        int end = n - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    static void palidromeORnot(String str) {
        StringBuilder str2 = new StringBuilder(str);
        StringBuilder s1 = str2.reverse();
        String ss = new String(s1);

        if (str.equalsIgnoreCase(ss)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }

    static void palindromeTwoPointers(char[] chArr) {
        char temporary[] = chArr;
        int start = 0;
        int n = chArr.length - 1;
        int end = n - 1;
        while (start < end) {
            char temp = chArr[start];
            chArr[start] = chArr[end];
            chArr[end] = temp;
            start++;
            end--;
        }

        System.out.println(temporary == chArr ? "palindrome" : "not palindrome");

    }
   public static boolean isVowel(char ch){
        boolean b= ch == 'a' || ch =='e' ||ch == 'i' || ch =='o' || ch =='u' ||ch =='A' || ch =='E' || ch =='I' || ch =='O' || ch =='U';
        return b;
    }

    static String reverseVowels(String str) {
        char []chArr=str.toCharArray();
        int n = chArr.length;
        int start = 0;
        int end = n - 1;
        while(start < n && !isVowel(chArr[start])){
            start++;
        }
        while(end >=0 && !isVowel(chArr[end])){
            end--;
        }

        while (start < end) {
            char temp = chArr[start];
            chArr[start] = chArr[end];
            chArr[end] = temp;
            start++;
            end--;
        }
    String mystr=new String(chArr);
        return mystr;
    }
}
