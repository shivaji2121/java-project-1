package com.MultiThreading.Runnable;

import java.util.concurrent.*;

public class Bank {
    static void main(String[] args) throws ExecutionException, InterruptedException {
        BankAccount b1=new BankAccount();
        Thread t1=new Thread(()->b1.withdraw(90));
        Thread t2=new Thread(()->b1.withdraw(90));
        Thread t3=new Thread(()->b1.withdraw(80));
//        t1.start();
//        t2.start();
//        t3.start();

        ExecutorService executorService= Executors.newFixedThreadPool(3);
//        Runnable task1=()->b1.withdraw(90);
//        Runnable task2=()->b1.withdraw(80);
//        Runnable task3=()->b1.withdraw(10);

//        executorService.submit(task1);
//        executorService.submit(task2);
//        executorService.submit(task2);

//        executorService.shutdown();

        Callable<Integer> task1=()->b1.withdraw(90);
        Callable<Integer> task2=()->b1.withdraw(80);
        Callable<Integer> task3=()->b1.withdraw(10);

        Future future=executorService.submit(task1);
        Future future1=executorService.submit(task2);
        Future future2=executorService.submit(task3);

        System.out.println(future.get());
        System.out.println(future1.get());
        System.out.println(future2.get());

        executorService.shutdown();

        System.out.println("welcome to spring boot");
    }
}
