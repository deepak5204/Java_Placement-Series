package ObjectOrientedProgramming.inheritance;

//car is inheriting property from vehicle
public class Car extends Vehicle{

    int door;

    // here print() override the print() of Vehicle class
    public void print(){
        System.out.println("Car color "  + getColor()+ " maxSpeed "+ maxSpeed+ " no of doors " + door);
    }
}
