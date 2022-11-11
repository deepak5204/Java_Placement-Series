package ObjectOrientedProgramming.generics;

public class Student implements PrintInterface {
    int rollNumber;

    // make constructor
    public Student(int rollNumber){
        this.rollNumber = rollNumber;
    }

    @Override
    public void print() {
        System.out.println(rollNumber);
    }
}
