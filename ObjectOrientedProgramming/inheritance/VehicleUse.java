package ObjectOrientedProgramming.inheritance;

public class VehicleUse {
public static void main(String[] args){
    // Vehicle v = new Vehicle();
    // v.setColor("red");
    // System.out.println(v.getColor());
    // v.maxSpeed = 100;
    // v.print();

    Car c = new Car();
    c.setColor("black");
    c.maxSpeed = 250; //here this is car's maxSpeed
    c.door = 4;
    // c.printCar();
    c.printMaxSpeed();
    c.print();

    // Bicycle b = new Bicycle();
    // b.setColor("white");
    // b.maxSpeed = 120;
    // b.printBicycle();
}
}
