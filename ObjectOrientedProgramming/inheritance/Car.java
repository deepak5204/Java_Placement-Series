package ObjectOrientedProgramming.inheritance;

//car is inheriting property from vehicle
 public abstract class Car extends Vehicle{

    int numDoors;
    // int maxSpeed;

    // public Car(int numDoors, int maxSpeed){
    //     /* 
    //         here car is trying to call default constructor but default constructor is not present in vehicle class
    //         so explicitly call own constructor by using super 
    //     */
    //     // if default constructor is not avsilsble  then it is necessary to call
    //     super(maxSpeed); //(it must be first call in the car class because before any execution in car class shall begin the first call should be made to its parent )  // try to call empty constructor super()
    //     this.numDoors = numDoors;
    //     System.out.println("Car's constructor");

    // }

    // here print() override the print() of Vehicle class
    public void print(){
        super.print(); //this print() vehicle's print() 
        System.out.println("Car " + " numDoors " + numDoors);
    }

    public void printMaxSpeed(){
        // super.maxSpeed = 100; //set maxSpeed to vechile
        System.out.println(maxSpeed + " "+ super.maxSpeed);
    }


    //complete abstract method
    public boolean isMotorized(){
        return true;
    }
}
