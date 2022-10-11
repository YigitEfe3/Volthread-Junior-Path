package org.example.BasicIO.turkcellBufferedReaderBufferedWriter1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
*
* Buffered Writer takes the lines and stores all of them inside a buffer. To write to the disk from the buffer:
*       --The buffer needs to be full, so the lines after could go directly to the disk
*       --upon calling bufferedWriter.close() method.
*               --this method FLUSHES the lines to the disk before closing
* bufferedWriter.flush()
*       --Takes the bytes in the buffer and writes them into the disk.
*       --If we do not have line 45, lines will write to disk after program terminates
*       --but now a line is being written to the disk as soon as we hit enter on the console
*
* */


public class bufferedWriter {
    public static void main(String[] args) {

        File file = new File("bufferedWriterExample.txt");
        BufferedWriter bufferedWriter = null;
        FileWriter fileWriter = null;

        if(file.exists())
            System.out.println("File found");
        else
            System.out.println("File not found");

        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);

            Scanner scanner = new Scanner(System.in);

            String line = null;

            while(!(line = scanner.nextLine()).equals("quit")){
                bufferedWriter.write(line);
                bufferedWriter.flush();
            }

            scanner.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if(bufferedWriter != null){
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
            if(fileWriter != null){
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }



    }
}
