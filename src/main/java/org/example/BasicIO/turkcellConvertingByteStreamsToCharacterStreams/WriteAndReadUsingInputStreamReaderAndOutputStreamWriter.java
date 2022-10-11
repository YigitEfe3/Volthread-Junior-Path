package org.example.BasicIO.turkcellConvertingByteStreamsToCharacterStreams;

import java.io.*;

public class WriteAndReadUsingInputStreamReaderAndOutputStreamWriter {

    public static void main(String[] args) {

        //writeToFile();    //writes Hello World! to the text file.
        readFromFile();     //reads all the lines from the text file and displays in the console.

    }

    public static void readFromFile(){
        File file = new File("WriteAndReadUsingInputStreamReaderAndOutputStreamWriter.txt");
        FileInputStream fileInputStream = null;         //reference to the file
        InputStreamReader inputStreamReader = null;     //reference to the inputStream
        BufferedReader bufferedReader = null;           //reference to the streamReader for better efficiency

        try {

            fileInputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(fileInputStream);
            bufferedReader = new BufferedReader(inputStreamReader);

            String line = null;

            while((line= bufferedReader.readLine()) != null){
                System.out.println(line);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if(bufferedReader != null){
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }

            if(inputStreamReader != null){
                try {
                    inputStreamReader.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }

            if(fileInputStream != null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }



    public static void writeToFile(){

        File file = new File("WriteAndReadUsingInputStreamReaderAndOutputStreamWriter.txt");

        FileOutputStream fileOutputStream = null;   //reference to the file

        try{
            fileOutputStream = new FileOutputStream(file);

            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            outputStreamWriter.write("Hello World!");   //can write Turkish characters
            outputStreamWriter.close();

        } catch (IOException e){
            System.out.println(e.getMessage());
        } finally {
            if(fileOutputStream != null){
                try {
                    fileOutputStream.close();       //throws an IOException
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }

    }
}
