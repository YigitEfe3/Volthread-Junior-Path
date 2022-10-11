package org.example.Threads.GuardedBlocks;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Producer implements Runnable {
    private Drop drop;

    public Producer(Drop drop) {
        this.drop = drop;
    }

    public void run() {
        String importantInfo[] = {
                "Mares eat oats",
                "Does eat oats",
                "Little lambs eat ivy",
                "A kid will eat ivy too"
        };
        Random random = new Random();

        for (int i = 0; i < importantInfo.length; i++) {

            drop.put(importantInfo[i]);

            try {
                Thread.sleep(2000);     //2 second sleep
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

        drop.put("DONE");
    }
}
