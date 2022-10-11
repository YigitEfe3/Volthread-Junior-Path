package org.example.BasicIO.turkcellInputStreamOutputStream1;

import java.io.*;
import java.util.Scanner;
/*
*
* In this class, there is already a file in the project's folder.
*   We simply take lines from the user and
*   write inside an already existing file
*
* CreateFileAndWriteToItFromTheConsole.java inside the turkcellFileAndPathClasses2 package has a similar function
*   takes the path from the user,
*   creates a new file in that path,
*   takes lines from the user,
*   and write the lines inside that newly created file
*
* */
public class WriteToAnExistingFileFromTheConsoleAndReadIt {
    public static void main(String[] args) {
        writeFile();
        readFile();
    }

    public static void writeFile(){
        //finds a file
        File file = new File("turkcellInputStreamOutputStream1Output.dat");
        FileOutputStream fileOutputStream = null;
        Scanner scanner = new Scanner(System.in);

        try {
            fileOutputStream = new FileOutputStream(file);
            String line = null;

            //gets lines from the console until the user enters "quit"
            while(!(line = scanner.nextLine()).equals("quit")){
                fileOutputStream.write(line.getBytes());    //and writes the lines to the specified file
            }


        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if(fileOutputStream != null){
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
            scanner.close();
        }
    }





    public static void readFile(){
        //takes the same file as before in order to read it
        File file = new File("turkcellInputStreamOutputStream1Output.dat");
        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream(file);
            int c = 0;

            //reads the characters in the stream into c (but as an integer (ASCII or Hexadecimal))
            while((c = fileInputStream.read()) != -1){
                System.out.print(c + " ");  //writes the ASCII of the characters to console
            }

        } catch (IOException e) {
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
