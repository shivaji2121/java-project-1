package com.MultiThreading;

class Counter {
    private int count = 0;

    public  void increment() {
//        synchronized(this){
//        count++;
//        }
        count++;
    }

    int getCount() {
        return count;
    }
}

public class SyncMethodDemo {
    static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        thread1.start();
        thread2.start();
        thread1.setPriority(5);
        thread2.setPriority(1);

        thread1.join();
        thread2.join();
        System.out.println("final count: " + counter.getCount());
    }
}
