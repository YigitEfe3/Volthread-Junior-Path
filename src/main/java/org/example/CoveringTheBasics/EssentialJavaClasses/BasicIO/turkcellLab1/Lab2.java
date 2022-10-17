package org.example.CoveringTheBasics.EssentialJavaClasses.BasicIO.turkcellLab1;

import java.io.*;

//The goal of this lab is to;
//      read text from one file,
//      convert them into all caps,
//      write the text to another file.

public class Lab2 {

    public static void main(String[] args) {

        File fileRead = new File("lab1read.txt");
        File fileWrite = new File("lab1write.txt");

        //we can check if the files exist or not using if statements.

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try{

            fileReader = new FileReader(fileRead);
            bufferedReader = new BufferedReader(fileReader);

            fileWriter = new FileWriter(fileWrite);
            bufferedWriter = new BufferedWriter(fileWriter);

            String line = null;

            while((line = bufferedReader.readLine()) != null){  //read from the file line by line
                String lineUpper = line.toUpperCase();          //convert line to upper case
                bufferedWriter.write(lineUpper);                //write the upper line
                bufferedWriter.newLine();                       //insert a new line after each line to maintain similarity
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        } finally {
            try{
                if(bufferedWriter != null)
                    bufferedWriter.close();
                if(fileWriter != null)
                    fileWriter.close();
                if(bufferedReader != null)
                    bufferedReader.close();
                if(fileReader != null)
                    fileReader.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
