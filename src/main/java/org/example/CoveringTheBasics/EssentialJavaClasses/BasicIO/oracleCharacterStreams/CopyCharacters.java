package org.example.CoveringTheBasics.EssentialJavaClasses.BasicIO.oracleCharacterStreams;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacters {

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

    public static void main(String[] args) throws IOException {

        FileReader inputStream = null;
        FileWriter outputStream = null;

        File inputFile = new File("oracleCharacterStreamsInput.txt");
        File outputFile = new File("oracleCharacterStreamsOutput.txt");



        try {
            //to read characters from the file using FileReader
            inputStream = new FileReader("oracleCharacterStreamsInput.txt");

            //to write the characters from above to the file using FileWriter
            outputStream = new FileWriter("oracleCharacterStreamsOutput.txt");

            int c;
                        //reads the characters here
            while ((c = inputStream.read()) != -1) {
                //and writes the characters here
                outputStream.write(c);
            }
        } catch(IOException e){
            System.out.println(e.getMessage());
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }




    }
}
