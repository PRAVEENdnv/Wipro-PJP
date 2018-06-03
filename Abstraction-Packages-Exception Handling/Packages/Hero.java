/*
Create a package called com.automobile. Define an abstract class called Vehicle. 
Vehicle class has the following abstract methods: 
public String getModelName() 
public String getRegistrationNumber() 
public String getOwnerName() 

Create TwoWheeler subpackage under Automobile package
Hero  class extends  Automobile.vehicle class 
public int getSpeed() 
– Returns the current speed of the vehicle.
public void radio() 
– provides facility to control the radio device 
Honda class extends com.automobile.vehicle class
public int getSpeed()
– Returns the current speed of the vehicle.
public void cdplayer() 
– provides facility to control the cd player device which is available in the car.
Create a test class to test the methods available in all these child class.
*/

package com.automobile.twowheeler;
import com.automobile.Vehicle;

public class Hero extends Vehicle {
    public String getModelName() {
        System.out.println("Model Name: Hero Honda");
        return "Hero Honda";
    }

    public String getRegistrationNumber() {
        System.out.println("Regn No: WB24E1924");
        return "WB24E1924";
    }

    public String getOwnerName() {
        System.out.println("Owner: Rohit Das");
        return "Rohit Das";
    }

    public void radio() {
        System.out.println("Controls for Radio");
    }

    public int getSpeed() {
        System.out.println("Speed: 40 kmph");
        return 40;
    }

    public void cdplayer() {
        System.out.println("Controls for CD Player");
    }
}