package com.DSA.Strings.StringDsa;

public class RemoveVowels {
    public static void main(String[] args) {
        removeVowels("shivaprasadbangi");
    }
    public static boolean isVowel(char ch){
        boolean b= ch == 'a' || ch =='e' ||ch == 'i' || ch =='o' || ch =='u' ||ch =='A' || ch =='E' || ch =='I' || ch =='O' || ch =='U';
        return b;
    }

    static void removeVowels(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!isVowel(ch)) {
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }
}
