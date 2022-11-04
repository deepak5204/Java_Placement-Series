package ObjectOrientedProgramming.inheritance;

//car is inheriting property from vehicle
public class Car extends Vehicle{

    int door;
    int maxSpeed;

    // here print() override the print() of Vehicle class
    public void print(){
        super.print(); //this print() vehicle's print() 
        System.out.println("Car " + " no of doors " + door);
    }

    public void printMaxSpeed(){
        super.maxSpeed = 100; //set maxSpeed to vechile
        System.out.println(maxSpeed + " "+ super.maxSpeed);
    }
}
