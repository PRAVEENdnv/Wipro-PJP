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

import com.automobile.twowheeler.Hero;

class Test {
    public static void main(String[] args) {
        Hero h = new Hero();
        h.getModelName();
        h.getRegistrationNumber();
        h.getOwnerName();
        h.getSpeed();
        h.radio();
        h.cdplayer();
    }
}