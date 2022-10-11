package org.example.BasicIO.turkcelSerializationLab1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadingClass {
    public static void main(String[] args) {
        File file = new File("turkcellSerializationLabExampleWrite.txt");

        if(file.exists()){
            FileInputStream fileInputStream = null;
            ObjectInputStream objectInputStream = null;

            try{
                fileInputStream = new FileInputStream(file);
                objectInputStream = new ObjectInputStream(fileInputStream);

                Car car = (Car) objectInputStream.readObject();

                System.out.println(car);

            } catch(IOException | ClassNotFoundException e){
                System.out.println(e.getMessage());
            } finally {
                try{
                    if(objectInputStream != null)
                        objectInputStream.close();
                    if(fileInputStream != null)
                        fileInputStream.close();
                } catch (IOException e){
                    System.out.println(e.getMessage());
                }
            }
        } else {
            System.out.println("File not found.");
        }
    }

}
