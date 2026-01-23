package com.javaTest1;
public class Test1 {

    static void main(String[] args) {
        palindrome(100);
        frequency();
        reverse();



    }

    static void palindrome(int n) {
        int r = 1, sum = 0, temp = 0;
        temp = n;
        while (n > 0) {
            r = n % 10;
            sum = sum * 10 + r;
            n = n / 10;
        }
        if (temp == sum) {
            System.out.println("palindrome");
        } else {
            System.out.println("not a palindrome");
        }
    }

    static void frequency() {
        String str = "programming";
        char[] chArr = str.toCharArray();
        for (int i = 0; i < chArr.length; i++) {
            for (int j = i+1 ; j < chArr.length; j++) {
                int count = 0;
                if (chArr[i] == chArr[j]) {
                    count++;
                    System.out.println(chArr[j]+"->"+count);
                }
            }
        }
    }

    static  void reverse(){
        String str = "Java is powerful";
        String[] s1 = str.split(" ");
        for (int i = 0; i < s1.length; i++) {
            s1[i] = new StringBuilder(s1[i]).reverse().toString();
        }
        String result = String.join(" ", s1);
        System.out.println(result);


    }

}
//section 1:
//1.
//2.C
//3.B
//4.D
//section 2:
//question 1:false,true
//question 2:15
//
