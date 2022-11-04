package ObjectOrientedProgramming.inheritance;

public class Vehicle {
    private String color;
    // protected int maxSpeed;
    public int maxSpeed;


    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void print(){
        System.out.println("Vehicle color "  + color + " maxSpeed "+ maxSpeed);
    }
    
}
