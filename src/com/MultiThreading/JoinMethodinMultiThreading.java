package com.MultiThreading;
class Thread2 extends Thread{
    public  void run(){
//        for (int i = 0; i < 10; i++) {
//            System.out.println("value..."+i+" "+Thread.currentThread().getName());
//        }
        System.out.println("runniung thread: "+Thread.currentThread().getName());
    }
}

public class JoinMethodinMultiThreading {
    static void main(String[] args) throws InterruptedException {
        Thread2 th1=new Thread2();
        Thread2 th2=new Thread2();
        th1.start();

//        th1.start();
//        th1.join();

//        th2.start();
//        th2.join();
    }
}
