/*
Add the following ideas to the previous hands on: 
Create FourWheeler subpackage under Automobile package
Logan class extends com.automobile.vehicle class
public int speed()
– Returns the current speed of the vehicle.
public int gps() 
– provides facility to control the gps device 
Ford class extends  com.automobile.vehicle class
public int speed()
– Returns the current speed of the vehicle.
public int tempControl() 
– provides facility to control the air conditioning device which is available in the car
*/

package com.automobile.fourwheeler;
import com.automobile.Vehicle;

public class Logan extends Vehicle {
    public String getModelName() {
        System.out.println("Model Name: Logan");
        return "Logan";
    }

    public String getRegistrationNumber() {
        System.out.println("Regn No: WB24E1801");
        return "WB24E1801";
    }

    public String getOwnerName() {
        System.out.println("Owner: Rohit Das");
        return "Rohit Das";
    }

    public int speed() {
        System.out.println("Speed: 50 kmph");
        return 50;
    }

    public int gps() {
        System.out.println("Controls GPS");
        return 1;
    }

    public int tempControl() {
        System.out.println("Controls for air conditioning");
        return 1;
    }
}