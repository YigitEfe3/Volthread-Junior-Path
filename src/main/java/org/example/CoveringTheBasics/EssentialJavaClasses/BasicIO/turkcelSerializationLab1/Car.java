package org.example.CoveringTheBasics.EssentialJavaClasses.BasicIO.turkcelSerializationLab1;

import java.io.Serializable;

public class Car implements Serializable {
    private String brand;
    private String model;
    private String plate;
    private int year;
    private Engine engine;

    public Car() {
    }

    public Car(String brand, String model, String plate, int year, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.plate = plate;
        this.year = year;
        this.engine = engine;
    }

    @Override
    public boolean equals(Object obj) {
        Car car = (Car) obj;
        return this.plate.equals(car.plate);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", plate='" + plate + '\'' +
                ", year=" + year +
                ", engine=" + engine +
                '}';
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
