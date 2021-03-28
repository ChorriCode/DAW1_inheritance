package com.javier.inheritance;


public class Vehicle {
    
    // ATTRIBUTES
    private String brand;
    private int amountWheel;

    // CONSTRUCTORS
    public Vehicle() {
    }

    public Vehicle(String brand, int amountWheel) {
        this.brand = brand;
        this.amountWheel = amountWheel;
    }
    
    // SOME METHODS THAT YOU NEED
    
    // GETTER AND SETTERS
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getAmountWheel() {
        return amountWheel;
    }

    public void setAmountWheel(int amountWheel) {
        this.amountWheel = amountWheel;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "brand=" + brand + ", amountWheel=" + amountWheel + '}';
    }


}
