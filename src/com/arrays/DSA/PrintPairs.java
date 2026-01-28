package com.arrays.DSA;

public class PrintPairs {
    static void main(String[] args) {
        int arr[]={10,20,30};
        printTriplets(arr);
    }
    static void printPairs(int...arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                System.out.println(arr[i]+"--"+arr[j]);
            }
        }
    }

    static void printTriplets(int...arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {

                    System.out.println("("+arr[i]+","+arr[j]+","+arr[k]+")");
                }
            }
        }
    }
}
