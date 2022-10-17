package org.example.CoveringTheBasics.EssentialJavaClasses.BasicIO.turkcellFileAndPathClasses2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateFileAndWriteToItFromTheConsole {

    /*
     * This class
     *   takes the path from the user,
     *   creates a new file in that path,
     *   takes lines from the user,
     *   and write the lines inside that newly created file
     *
     * newclass inside the turkcellInputStreamOutputStream package has a similar function
     *   In newclass, there is already a file in the project's folder.
     *   We simply take lines from the user and
     *   write inside an already existing file
     *
     * */

    public static void main(String[] args) {
        //gets a file path from the user to create a file in it
        Scanner scanner = new Scanner(System.in);
        System.out.print("File Path:");
        String filePath = scanner.nextLine();

        //and creates the specified file inside the specified path
        File file = new File(filePath);
        if(!file.exists()){
            try {
                boolean fileCreated = file.createNewFile();

                if(fileCreated){
                    System.out.println("File created.");
                }

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("The file already exists.");
        }



        //FileWriter is used to write character based data inside a file
        FileWriter fileWriter = null;   //FileWriter throws an IOException

        try {

            fileWriter = new FileWriter(file);
            String line = null;

            //write the inputted lines inside the newly created file until the user inputs "quit"
            do {
                line = scanner.nextLine();

                if(line.equals("quit")){
                    System.out.println("Exiting writing mode.");
                }
                else{
                    fileWriter.write(line);
                    fileWriter.write(" ");   //puts a white space between inputs
                    //fileWriter.write("\n");    //puts a new line between inputs   (OS dependent)
                    //fileWriter.write(System.lineSeperator());                    //OS independent
                }
            } while (!line.equals("quit"));




        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {

            if(fileWriter != null){

                try {
                    fileWriter.close();     //close method also throws an IOException
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }

            }

        }


        scanner.close();

        System.out.println("File writing successful.");
        System.out.println("File Size: " + file.length() + "byte.");
    }

}
