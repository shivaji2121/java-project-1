package com.MultiThreading;


public class LocalThreads {
    private static ThreadLocal<Integer> threadCounter = ThreadLocal.withInitial(() -> 0);

    public static void main(String[] args) {
        Runnable task=()->{
            int counter=threadCounter.get();
            counter+=1;
            threadCounter.set(counter);
            System.out.println(Thread.currentThread().getName()+"--"+threadCounter.get());
        };

        Thread t1=new Thread(task,"task1");
        Thread t2=new Thread(task,"task2");
        t1.start();
        t2.start();

    }
}
