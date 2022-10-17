package org.example.CoveringTheBasics.EssentialJavaClasses.Threads.Examples.Example1;

public class Multithreading {
    public static void main(String[] args) {


        for(int i = 0; i<3; i++){               //runs 3 threads at once
            MultiThread multiThreadLoop = new MultiThread(i);
            Thread myThread = new Thread(multiThreadLoop);      //for when you implement Runnable
            multiThreadLoop.start();
            myThread.start();                                   //for implementing Runnable
        }
        /*     RUNS TWO THREADS SIMULTANEOUSLY
        MultiThread multiThread = new MultiThread();
        MultiThread multiThread2 = new MultiThread();

        multiThread.start();
        multiThread2.start();
        */
    }
}