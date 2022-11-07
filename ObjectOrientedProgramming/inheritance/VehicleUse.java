package ObjectOrientedProgramming.inheritance;

import java.util.Scanner;

public class VehicleUse {
public static void main(String[] args){

    

    // Vehicle v;
    // Car c = new Car(4, 100);
    // v = new Car(6, 200);
    // v = new Bicycle();
    // v.print();
    // System.out.println(v.isMotorized());

    /* 
     ***** in java Object is super class of all class *****
     */

    // typecasting tke plave it may risky
    // Vehicle v = new Car(4, 200);
    // Car c = (Car) v;
    // c.numDoors = 4;

    // polymorphism :- one thing that is capable of taking multiple forms

    // Vehicle v; // this is creating reference of vehicle only
    
    Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    sc.close();
    // if(n < 10){
    //     v = new Car(4, 100);
    // } else {
    //     v = new Vehicle();
    // }

    // v.print();

    // Car c = new Vehicle(); we cannot do because every vehicle is not a car

    // every car is vehicle
    // Vehicle v = new Car(4, 100); // if you have reference of base class than that can refer to object of subclasses or derived class


    // v = new Bicycle(); //we can write this way is absolutely ok

    //v......... all vehicle specific properties are accessible
    // v.maxSpeed = 200;

    // v.numDoors = 4; //it will throw error

    // which print function will call? when car has print() and vehicle has print function as well.
    //ans:- which print will call this decision is taking runtime, so this is called runtime Polymorphism
    // v.print();  // ultemetaly v is refering to a car the reference type is vehicle 
    



// inheritance and constructor

    // // Vehicle v = new Vehicle(); // it call default vehicle's constructor
    // Car c = new Car(6, 140); //first call default vehicle's constructor then call default car's constructor
    // c.print();



    // Vehicle v = new Vehicle();
    // v.setColor("red");
    // System.out.println(v.getColor());
    // v.maxSpeed = 100;
    // v.print();

    // Car c = new Car();
    // c.setColor("black");
    // c.maxSpeed = 250; //here this is car's maxSpeed
    // c.door = 4;
    // // c.printCar();
    // c.printMaxSpeed();
    // c.print();

    // Bicycle b = new Bicycle();
    // b.setColor("white");
    // b.maxSpeed = 120;
    // b.printBicycle();
}
}
