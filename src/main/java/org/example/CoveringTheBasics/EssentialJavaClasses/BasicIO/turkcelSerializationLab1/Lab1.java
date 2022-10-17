package org.example.CoveringTheBasics.EssentialJavaClasses.BasicIO.turkcelSerializationLab1;

import java.io.*;

public class Lab1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setBrand("Ford Shelby Mustang");
        car.setModel("GT500");
        car.setPlate("06 NH 434");
        car.setYear(1967);

        Engine engine = new Engine();
        engine.setVolume(1600);
        car.setEngine(engine);

        //System.out.println(car);

        File file = new File("turkcellSerializationLabExampleWrite.txt");
        if(file.exists()){
            FileOutputStream fileOutputStream = null;
            ObjectOutputStream objectOutputStream = null;
            //OutputStreamWriter outputStreamWriter = null;

            try{
                fileOutputStream = new FileOutputStream(file);
                objectOutputStream = new ObjectOutputStream(fileOutputStream);
                //outputStreamWriter = new OutputStreamWriter(objectOutputStream);

                objectOutputStream.writeObject(car);

            } catch(IOException e){
                System.out.println(e.getMessage());
            } finally {
                try{
                    if(objectOutputStream != null)
                        objectOutputStream.close();
                    if(fileOutputStream != null)
                        fileOutputStream.close();
                } catch(IOException e){
                    System.out.println(e.getMessage());
                }
            }
        }
        else{
            System.out.println("File not found.");
        }
    }
}
