package org.example.Threads.Executors;

/*
*
* The Executor Interface
*       provides a single method: execute(). If r is a Runnable object, and e is an Executor you can
*       replace (new Thread(r)).start(); with e.execute(r);
*
*       creates a new thread and launches it immediately.
*
* The ExecutorService Interface
*
*       Supplements execute with a similar, but more versatile submit() method.
*       Like execute(), submit() accepts Runnable objects, but also accepts Callable objects, which allow the task
*       to return a value.
*       The submit() method returns a Future object, which is used to retrieve Callable return value and
*       to manage the status of both Callable and Runnable tasks.
*
*       Provides methods for submitting large collections of Callable objects.
*       Provides a number of methods for managing the shutdown of the executor.
*
* The SchedulesExecutorService
*
*       Supplements the methods of its parent with schedule(), which executes a Runnable or Callable task
*       after a specified delay.
*       In addition, the interface defines scheduleAtFixedRate and scheduleWithFixedDelay,
*       which executes specified tasks repeatedly, at defined intervals.
*
* To sum up;
*       From parent to child, Executor -> ExecutorService -> ScheduledExecutorService
*                             execute()      submit()               schedule()
*                               |               |                       |
*                               V               |                       |
*  create new thread and launch immediately.    V                       |
*      also accepts callable objects, allowing to have a return type.   V
*                                                                       executes after a specified delay.
*
*
* */


public class ExecutorInterfaces {
}
