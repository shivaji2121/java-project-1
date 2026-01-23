package com.MultiThreading;

class Test {
    synchronized void waitingMethod() {
        try {
            System.out.println("Thread is waiting...");
            wait();
            System.out.println("Thread is resumed!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized void notifyMetod() {
        System.out.println("Thread is notifying...");
        notify();
    }
}

class Thread11 extends Thread {
    Test t;

    public Thread11(Test t) {
        this.t = t;
    }

    public void run() {
        t.waitingMethod();
    }
}

class Thread22 extends Thread {
    Test t;

    public Thread22(Test t) {
        this.t = t;
    }
    public  void run(){
        t.notifyMetod();
    }
}

class Threads implements  Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thead is called: "+i+"--"+Thread.currentThread().getName());
        }
    }
}
public class InterThredCommunication {
    static void main(String[] args) throws InterruptedException {
//    Test obj=new Test();
//    Thread11 t1=new Thread11(obj);
//    Thread22 t2=new Thread22(obj);
//    System.out.println("is alive: "+t1.isAlive());
//    t1.start();
//        System.out.println("is alive: "+t1.isAlive());
//        try {
//            Thread.sleep(1000);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//        t2.start();
        Thread th1=new Thread(new Threads());
        Thread th2=new Thread(new Threads());
        Thread th3=new Thread(new Threads());
        th1.yield();
        th1.start();
        th2.start();
//        th3.start();
    }
}
