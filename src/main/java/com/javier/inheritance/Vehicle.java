package com.javier.inheritance;


public class Vehicle {
    
    // ATTRIBUTES
    private String brand;
    private int amountWheels;

    // CONSTRUCTORS
    public Vehicle() {
    }

    public Vehicle(String brand, int amountWheels) {
        this.brand = brand;
        this.amountWheels = amountWheels;
    }
    
    // SOME METHODS THAT YOU NEED
    
    // GETTER AND SETTERS
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getAmountWheels() {
        return amountWheels;
    }

    public void setAmountWheels(int amountWheels) {
        this.amountWheels = amountWheels;
    }

    @Override
    public String toString() {
        return "\nFROM CLASS VEHICLE:\n" + "Vehicle{" + "brand=" + brand + ", amountWheel=" + amountWheels + '}';
    }


}
