package org.example.CoveringTheBasics.EssentialJavaClasses.Threads.GuardedBlocks;



/*
*
* Threads often have to coordinate their actions. The most common coordination idiom is the guarded block.
* Such a block begins by polling a condition that must be true before the block can proceed.
*
* */


public class ProducerConsumerExample {
    public static void main(String[] args) {
        Drop drop = new Drop();
        (new Thread(new Producer(drop))).start();
        (new Thread(new Consumer(drop))).start();
    }
}