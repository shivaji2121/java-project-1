package com.MultiThreading;

class  MyThread implements Runnable{

    @Override
    public void run() {
        System.out.println("ins side run method: "+Thread.currentThread().getName());
    }
}

class  ThreadClass extends  Thread{
    @Override
    public void run() {
        System.out.println("In run method of MyThread- "
                + Thread.currentThread().getName());
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread execution : "+i);
        }
    }
}
public class MultithredingP1 {
    static void main(String[] args) {
        System.out.println("main thread: "+Thread.currentThread().getName());
//        Thread thread=new Thread(new MyThread());
//        Thread thread1=new Thread(new MyThread());
//        thread.start();
//        thread1.start();

        Thread th=new Thread(new ThreadClass(),"thread class");
        th.start();
        new ThreadClass().start();
    }
}
