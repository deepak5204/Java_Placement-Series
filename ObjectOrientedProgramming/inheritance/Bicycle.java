package ObjectOrientedProgramming.inheritance;

//Bicycle is inheriting property from vehicle
public class Bicycle extends Vehicle{

    public void printBicycle(){
        System.out.println("Bicycle color "  + getColor()+ " maxSpeed "+ maxSpeed);
    }
   
}
