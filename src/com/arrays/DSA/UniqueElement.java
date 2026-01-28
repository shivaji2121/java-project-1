package com.arrays.DSA;

public class UniqueElement {
    static void main(String[] args) {
        int arr[]={1,2,3,3,1,4,4,6,6};
        int x=uniqueEle(arr);
        System.out.println("unique element is: "+x);
    }

    static int uniqueEle(int...arr){
        int result=0;
        for (int i = 0; i < arr.length; i++) {
            result=result^arr[i];
        }
        return result;
    }
}
