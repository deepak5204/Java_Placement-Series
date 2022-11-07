package ObjectOrientedProgramming.inheritance_temp;

import ObjectOrientedProgramming.inheritance.Vehicle;

public class Truck extends Vehicle{
    int maxLoadingCapacity;

    public void print(){
        System.out.println("Vehicle color "  + getColor() + " maxSpeed "+ maxSpeed + " maxLoadingCapacity " + maxLoadingCapacity);
    }

      //complete abstract method
      public boolean isMotorized(){
        return true;
    }

}
