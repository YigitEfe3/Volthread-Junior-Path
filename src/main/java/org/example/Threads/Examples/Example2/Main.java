package org.example.Threads.Examples.Example2;

public class Main {
    public static void main(String[] args){

        MyThread thread1 = new MyThread();              //Creating a thread with a class extending Thread

        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);      //Creating a thread with a class implementing Runnable

        thread1.start();

        try {
            //thread1.join();             //main thread starts after thread1 finishes
            thread1.join(3000);     //main thread starts 3 seconds after thread1 starts
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        thread2.start();




    }
}
