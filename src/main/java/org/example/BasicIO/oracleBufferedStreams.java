package org.example.BasicIO;

public class oracleBufferedStreams {

    /*
    *
    * Not using buffered streams means each read or write request is handled directly by the underlying OS.
    * This can make a program much less efficient since each such request often triggers
    *                                                                               disk access,
    *                                                                               network activity,
    * or some other operation that is relatively expensive.
    *
    * To reduce this inefficiency, Java platform implements buffered I/O streams.
    * Buffered input streams read data from a memory area known as a buffer, the native input API is called only when
    * the buffer is empty. Similarly, buffered output streams write data to a buffer, and the native API is
    * called only when the buffer is full.
    *
    * */
}
