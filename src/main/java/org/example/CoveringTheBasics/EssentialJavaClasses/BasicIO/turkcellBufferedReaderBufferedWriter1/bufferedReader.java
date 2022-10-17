package org.example.CoveringTheBasics.EssentialJavaClasses.BasicIO.turkcellBufferedReaderBufferedWriter1;

import java.io.*;

public class bufferedReader {

    /*
    *
    * BUFFERED READER
    *   Writes the characters, arrays or lines to the buffer
    *   processing the read data in the buffer enhances performance
    *   Buffer length is optional
    *   If the data in the source is too big,
    *       FileReader or InputStreamReader classes are used
    *       instead of read() or readLine() directly.
    *
    * BUFFERED WRITER
    *   Used to write into a character stream
    *   Buffer length is optional
    *   High performance when writing characters, arrays, and strings
    *
    *
    * */

    public static void main(String[] args) {

        File file = new File("WriteAndReadUsingInputStreamReaderAndOutputStreamWriter.txt");
        BufferedReader bufferedReader = null;
        FileReader fileReader = null;

        if(file.exists())
            System.out.println("File found.");
        else
            System.out.println("File not found.");

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;

            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }


        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if(bufferedReader != null){
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
            if(fileReader != null){
                try {
                    fileReader.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }


    }
}
