package com.javier.inheritance;

public class Main {


    public static void main(String[] args) {
        
        // let's create two objects: from parent Vehicle and from child Car
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        //Assign car to vehicle and backwards
        //vehicle = car;
        //car = vehicle;
        //Assign bicycle to vehicle and backwards
        //vehicle = bicycle;
        //bicycle = vehicle;
        //let's create a vehicle of type Car
        //Vehicle vehicle = new Car();
        //vehicle = car;
        System.out.println(vehicle);
        System.out.println(car);
        System.out.println(bicycle);
        
        
        /*
        Integer number = 1;
        String word = "uno";
        number = word;
        word = number;
        */

    }
    
}
