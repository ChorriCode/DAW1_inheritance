package com.javier.inheritance;


public class Car extends Vehicle{
    
    // ATTRIBUTES
    private int engineCC;

    // CONSTRUCTORS
    public Car() {
    }

    public Car(int engineCC, String brand, int amountWheel) {
        super(brand, amountWheel);
        this.engineCC = engineCC;
    }

    // SOME METHODS THAT YOU NEED
    
    // GETTER AND SETTERS
    public int getEngineCC() {
        return engineCC;
    }

    public void setEngineCC(int engineCC) {
        this.engineCC = engineCC;
    }

    @Override
    public String toString() {
        return "\nFROM CLASS CAR AND " + super.toString() + "Car{" + "engineCC=" + engineCC + '}';
        //return "Car{" + "engineCC=" + engineCC + '}';
    }
    
    
}
