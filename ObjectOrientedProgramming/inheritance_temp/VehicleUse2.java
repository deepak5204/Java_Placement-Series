package ObjectOrientedProgramming.inheritance_temp;

import ObjectOrientedProgramming.inheritance.Car;
import ObjectOrientedProgramming.inheritance.Vehicle;

public class VehicleUse2 extends Vehicle{
    
    public static void main(String[] args){
        // Vehicle v = new Vehicle(); // we can not create vehicle object because vehicle is incomplete
        // v.maxSpeed = 200; // here protected is not accessible in outside the package in derived class
        Vehicle v = new Car(4, 150);
        v.setColor("black");
        v.maxSpeed = 200;

        v.print();
        Truck t = new Truck();
        v.setColor("black");
        v.maxSpeed = 80; 
        t.maxLoadingCapacity = 10000;
        t.print();

    }

    //complete the abstract method
    public boolean isMotorized() {
       return false;
    }
    
    
}
