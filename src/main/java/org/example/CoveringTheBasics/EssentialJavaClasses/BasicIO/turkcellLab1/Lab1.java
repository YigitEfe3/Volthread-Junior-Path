package org.example.CoveringTheBasics.EssentialJavaClasses.BasicIO.turkcellLab1;

import java.io.*;

public class Lab1 {

    //------------------------------------

    //NOT WORKING
        //ONLY WRITES THE LAST LINE

    //-----------------------------------
    public static void main(String[] args) {
        readFromFile();
    }

    public static void writeToFile(String line){
        File file = new File("lab1write.txt");

        if(file.exists()){
            FileWriter fileWriter = null;
            BufferedWriter bufferedWriter = null;

            try{

                fileWriter = new FileWriter(file);
                bufferedWriter = new BufferedWriter(fileWriter);

                bufferedWriter.append(line);


            } catch (IOException e){
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
        } else {
            System.out.println("File not found. Creating new file...");
        }
    }

    public static void readFromFile(){
        File file = new File("lab1read.txt");
        if(file.exists()){

            FileReader fileReader = null;
            BufferedReader bufferedReader = null;

            try{

                fileReader = new FileReader(file);
                bufferedReader = new BufferedReader(fileReader);

                String line = null;

                while((line = bufferedReader.readLine()) != null){
                    writeToFile(line);
                }


            } catch (IOException e){
                System.out.println(e.getMessage());
            } finally {
                try{
                    if(bufferedReader != null){
                        bufferedReader.close();
                    }
                    if(fileReader != null){
                        fileReader.close();
                    }
                } catch (IOException e){
                    System.out.println(e.getMessage());
                }
            }


        }
        else{
            System.out.println("File not found.");
        }
    }

}
