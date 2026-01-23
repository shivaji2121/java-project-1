package com.Numbers;

public class PrintAllFactors {
    static void main(String[] args) {
        factors(36);
    }
    static void factors(int n){
        for (int i = 1; i < n; i++) {
            if(n%i==0){
                System.out.println("factors: "+i);
            }

        }
    }
}
