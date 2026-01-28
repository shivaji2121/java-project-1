package com.arrays.DSA;

public class MinNumberArr {
    static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        extremeEnd(arr);
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

    static void reverseArr(int... arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            swap(arr, left, right);
            left++;
            right--;
        }
    }

    static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void extremeEnd(int... arr) {
        int left = 0;
        int right = arr.length-1;
        while (left <= right) {
            if (left == right){
                System.out.println(arr[left]);
            }
            else{
                System.out.println(arr[left]);
                System.out.println(arr[right]);
            }
            left++;
            right--;
        }
    }

}
