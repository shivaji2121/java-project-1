package com.arrays;

public class Arrays {
   public static void main(String[] args) {
    print();
    System.out.println("-------");
    printReverse();
    int arr[]={1,2,3,3,4};
    printSum(arr);
    }
    static void print(){
// int arr[]={1,2,3,4,5};
// int arr[]=new int[10];
        int arr[]=new int[5];
        arr[0]=0;
        arr[1]=1;
        arr[2]=2;
        arr[3]=3;
        arr[4]=4;
        System.out.println(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    };
   static void  printReverse(){
        int arr[]={1,2,3,4,5};
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.println(arr[i]);
        }
    };
   static  void printSum(int arr[]){
       int sum=0;
       for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
       }
       System.out.println("sum: "+sum);
   }
}
