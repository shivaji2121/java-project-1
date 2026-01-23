package com.MultiThreading;

class Thead1 extends Thread {
    public void run() {
        System.out.println("is Daemon thread: "+Thread.currentThread().isDaemon());
        for (int i = 0; i < 10; i++) {
            System.out.println("current thread : " + Thead1.currentThread().getName());
            System.out.println("value..." + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class SleepMethodinThread {
    static void main(String[] args) {
        Thead1 th1 = new Thead1();
        th1.setName("shivaji");
        th1.start();

        Thead1 th2 = new Thead1();
        th2.setName("kavya");
        th2.setName("kavya");
        th2.start();

    }
}
