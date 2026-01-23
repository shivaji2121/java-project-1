package com.arrays.DSA;

public class MinNumberArr {
    static void main(String[] args) {
        reverseArr();
    }

    static int minValue(int... arr) {

        int minvalue = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (minvalue > arr[i]) {
                minvalue = arr[i];
            }
        }
        return minvalue;
    }
    static void reverseArr(int...arr){
        int left=0;
        int right=arr.length;
        while(left<=right){
//            swap(arr[left],arr[right]);
            left++;
            right--;
        }
    }
//    static int swap(int a,int b){
//        int temp=a;
//        a=b;
//        b=temp;
//        return
//    }
}
