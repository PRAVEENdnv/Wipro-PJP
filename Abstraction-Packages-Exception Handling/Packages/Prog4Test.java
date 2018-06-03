/*
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
import com.automobile.fourwheeler.Logan;

class Test {
    public static void main(String[] args) {
        Logan l = new Logan();
        l.getModelName();
        l.getRegistrationNumber();
        l.getOwnerName();
        l.speed();
        l.gps();
        l.tempControl();
    }
}