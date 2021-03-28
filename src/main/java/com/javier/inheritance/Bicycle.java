package com.javier.inheritance;

public class Bicycle {

    // ATTRIBUTES
    private String type; //cross or city

    // CONSTRUCTORS
    public Bicycle() {
    }

    public Bicycle(String type) {
        this.type = type;
    }
    
    // SOME METHODS THAT YOU NEED

    // METHODS GETTER, SETTERS AND TOSTRING 

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Bicycle{" + "type=" + type + '}';
    }
    
}
