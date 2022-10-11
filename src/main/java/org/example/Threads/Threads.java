package org.example.Threads;

/*
*
* If one of the threads throws an exception, it doesn't affect the other threads.
* For MultiThread class inside Example1 package, we can either implement Runnable or extend Thread
*       But since we can only extend one class because Java does not support multiple inheritance
*       It is better to implement Runnable when you have to extend another class
* While implementing Runnable can save you from creating the threads manually (commented line),
*       Extending Thread can help you keep track of the Threads you are using for better understandability
*
* Each thread can execute parts of your code in parallel with the main thread
*
* Threads with higher priority are executed in preference compared to threads with lower priority.
*       The priority of the thread differ from 1 to 10, 10 having the most priority
*
* The JVM continues to execute thread until either of the following occurs:
*       1 - The exit method of class Runtime has been called
*       2 - All user threads have died (finished executing or threw an exception)
*
* There are two kinds of threads:
*       1 - Deamon Threads: Deamon Thread is a low priority thread that runs in background to perform tasks such as
*           garbage collection. The JVM terminates itself when all user threads (non-deamon threads) finish their
*           execution.
*       2 - User Threads: Threads that has been created by the programmer
*               We can make user threads deamon threads.
*
* myThread.join();                              //If you want to stop the thread for some reason,
*                                                 you can use the join method. With the join method,
*                                                 you will wait until the other thread is done executing
*
*  myThread.join(3000);                           If we call myThread.join() in the main method,
*                                                 main will wait 3 seconds before starting.
*
* myThread.isAlive();                           //returns a boolean for whether the thread is currently still running
*
* Thread.activeCount();                         //how many threads are currently active
*
* Thread.currentThread().getName();             //returns the name of the currently used thread
*
* Thread.currentThread().setName("deneme");     //changes the name of the current thread to "deneme"
*
* Thread.currentThread().getPriority();         //returns the priority of the currently used thread
*
* Thread.currentThread().setPriority(10);       //sets the priority of the currently used thread to 10 (Highers Priority)
*
* Thread.sleep(1000)                            //To have your thread or your program to sleep (wait)
*                                                 for 1000 milliseconds (1 second)
*
* Thread.currentThread().isDeamon();            //returns true if the current thread is a deamon thread, false if not
*
* Thread.currentThread().setDeamon(true)        //sets the current thread as a deamon thread
*
*
*
* */

public class Threads {
}
