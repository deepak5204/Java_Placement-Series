package ObjectOrientedProgramming.inheritance;

//Bicycle is inheriting property from vehicle
public class Bicycle extends Vehicle{
    
    public Bicycle(){
        /* 
            here car is trying to call default constructor but default constructor is not present in vehicle class
            so explicitly call own constructor by using super 
        */
        super(100);
    }

    public void printBicycle(){
        System.out.println("Bicycle color "  + getColor()+ " maxSpeed "+ maxSpeed);
    }
   
}
