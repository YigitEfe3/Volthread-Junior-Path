package org.example.CoveringTheBasics.EssentialJavaClasses.Threads.GuardedBlocks;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Drop {
    // Message sent from producer to consumer.
    private String message;

    // True if consumer should wait for producer to send message,
    // false if producer should wait for consumer to retrieve message.
    private boolean empty = true;

    public synchronized String take() {

        while (empty) {             // Wait until message is available.         GUARDED BLOCK
            try {                                                        //The invocation of wait does not return until another thread has issued a
                wait();                                                  //notification that some special event may have occurred
            } catch (InterruptedException e) {}
        }

        empty = true;                   // Toggle status.
        notifyAll();            // Notify producer that status has changed.
        return message;
    }

    public synchronized void put(String message) {

        while (!empty) {            // Wait until message has been retrieved.
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

        empty = false;              // Toggle status.
        this.message = message;      // Store message.
        notifyAll();                // Notify consumer that status has changed.
    }
}
