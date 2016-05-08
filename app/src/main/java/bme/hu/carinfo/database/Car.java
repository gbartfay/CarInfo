package bme.hu.carinfo.database;

import com.orm.SugarRecord;

/**
 * Created by Gyuri_2 on 2016.05.08..
 */
public class Car extends SugarRecord{
    private String brand;
    private String model;
    private int year;
    private String engine;
    private int weight;
    private int power;
    private int doors;
    private String fuel;

    public Car() {
    }

    public Car(String brand, String model, int year, String engine, int weight, int power, int doors, String fuel)  {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.engine = engine;
        this.weight = weight;
        this.power = power;
        this.doors = doors;
        this.fuel = fuel;
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

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }
}
