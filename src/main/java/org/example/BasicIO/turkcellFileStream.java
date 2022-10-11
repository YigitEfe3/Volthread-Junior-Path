package org.example.BasicIO;

import java.io.*;

public class turkcellFileStream {

    /*
     *----------------------------------------------------
     *           |   Characters   |        Bytes          |
     * Files     | FileReader     | FileInputStream       |
     *           | FileWriter     | FileOutputStream      |
     * Buffering | BufferedReader | BufferedInputStream   |
     *           | BufferedWriter | BufferedOutputStream  |
     * Printing  | PrintWriter    | PrintStream           |
     *-----------------------------------------------------
     *
     * Character Streams are used usually for text based reading and writing
     * Byte Streams are used usually for resources that contain raw data like images, music, and video
     *
     * */

    public static void main(String[] args) {

        //Creates a new file
        File file = new File("ioex1.txt");

        //to read from the file

        FileInputStream fileInputStream = null;

        try{
            fileInputStream = new FileInputStream(file);

            int c = 0;
            while((c = fileInputStream.read()) != -1){
                System.out.print((char)c);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if(fileInputStream != null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


        //to write to the file
        /*

        //to access the file
        FileOutputStream fileOutputStream = null;

        try{
            fileOutputStream = new FileOutputStream(file);

            //get the byte of each character and writes it into the stream
            fileOutputStream.write("Merhaba".getBytes());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            {
                if(fileOutputStream != null){
                    try {
                        fileOutputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }*/
    }
}
