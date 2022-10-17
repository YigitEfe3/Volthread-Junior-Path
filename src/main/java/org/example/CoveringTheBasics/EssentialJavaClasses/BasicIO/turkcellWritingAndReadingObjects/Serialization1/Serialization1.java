package org.example.CoveringTheBasics.EssentialJavaClasses.BasicIO.turkcellWritingAndReadingObjects.Serialization1;


/*
*
* Serialization is writing the state of an object to the byte stream
*
* For an object to be serialized:
*   --The class has to be declared as public
*   --The class has to implement the Serializable interface
*   --The class has to contain a no-argument constructor
*   --All the fields of the class has to be serializable
*
* ObjectInputStream is used to read an object
* ObjectOutputStream is used to write an object
*
* */

import java.io.*;

public class Serialization1 {
    public static void main(String[] args) {
        writeToFile();
        readFromFile();
    }

    private static void writeToFile() {
        //define and initialize a new Student object
        Student student = new Student();
        student.setNo(1);
        student.setFirstName("Tony");
        student.setLastName("Stark");
        student.setClassNo("4-A");
        //print to console to check
        System.out.println(student);

        //create a new file to write the object inside
        File file = new File("turkcellSerializationExample.bin");

        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            //writes the student object inside the file
            objectOutputStream.writeObject(student);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try{
                if(objectOutputStream != null){
                    objectOutputStream.close();
                }
                if(fileOutputStream != null){
                    fileOutputStream.close();
                }
            } catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static void readFromFile(){
        File file = new File("turkcellSerializationExample.bin");

        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;

        try{
            fileInputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);

                                        //?????????
            Student student = (Student) objectInputStream.readObject();
            System.out.println(student);

            /*
            System.out.println(objectInputStream.readObject());
            */


        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            try{
                if(objectInputStream != null){
                    objectInputStream.close();
                }
                if(fileInputStream != null){
                    fileInputStream.close();
                }
            } catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
