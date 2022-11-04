package ObjectOrientedProgramming.inheritance;

//car is inheriting property from vehicle
public class Car extends Vehicle{

    int door;
    // this.door = door;
    public void printCar(){
        System.out.println("Car color "  + getColor()+ " maxSpeed "+ maxSpeed+ " no of doors " + door);
    }
}
