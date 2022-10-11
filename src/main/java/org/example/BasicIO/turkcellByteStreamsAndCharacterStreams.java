package org.example.BasicIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class turkcellByteStreamsAndCharacterStreams {

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

    //reading a byte resource
    //reads every byte inside the specified image file and outputs every byte to the console.

    public static void main(String[] args) {
        File file = new File("C:\\Users\\Yigit\\Desktop\\Yiğit\\avatar.jfif");
        //System.out.println(file.exists());//if the wanted file exists, write true to the console, write false otherwise

        if(file.exists()){
            FileInputStream fileInputStream = null;

            try{

                fileInputStream = new FileInputStream(file);
                byte[] buffer = new byte[1024];
                int length = 0;

                while((length = fileInputStream.read(buffer)) != -1){      //more efficient than read with no parameters
                    System.out.println(Arrays.toString(buffer));
                }
            } catch (IOException e){
                System.out.println(e.getMessage());
            } finally {
                if(fileInputStream != null){
                    try {
                        fileInputStream.close();
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
        }

    }



}
