package org.example.CoveringTheBasics.EssentialJavaClasses.Threads.Examples.Example1;

                    //or you can implement Runnable
public class MultiThread extends Thread{

    /**/

    private int threadNumber;

    public MultiThread(int threadNumber){
        this.threadNumber = threadNumber;
    }

    @Override
    public void run(){
        for(int i = 0; i<5; i++){
            System.out.println(i+1 + " from thread " + threadNumber);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
