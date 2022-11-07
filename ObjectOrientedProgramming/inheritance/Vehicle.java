package ObjectOrientedProgramming.inheritance;

public abstract class Vehicle {
    private String color;
    // protected int maxSpeed;
    public int maxSpeed;


    // default constructor available till we don't create our own constructor
    // public Vehicle(){
    //     System.out.println("Vehicle's constructor");
    // }

    public Vehicle(int maxSpeed){
        System.out.println("Vehicle's constructor");
        this.maxSpeed = maxSpeed;
    }

    //default constructor
    public Vehicle() {
        System.out.println("Vehicle's constructor");
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void print(){
        System.out.println("Vehicle color "  + color + " maxSpeed "+ maxSpeed);
    }


    //abstract keyword
    public abstract boolean isMotorized();
    
}
