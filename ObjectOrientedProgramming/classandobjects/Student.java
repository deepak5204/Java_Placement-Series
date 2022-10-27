package ObjectOrientedProgramming.classandobjects;

public class Student {
    public String name;
    final private int roll_no;
    double cgpa;
    // We can not modify it further
    final static double conversionFActor = 0.95;

    // static variable belong to the class it not belong to every object but it share common functionality with all object .
    // It does not create seperate memory for every object  
    static int numStudent;


    //constructor
    public Student(String name){
        this.name = name;
        numStudent++;
        this.roll_no = numStudent;
    }

    public Student(){
        name = "xyz";
        numStudent++;
        roll_no = numStudent;
    }
    
   
    
    // public void setRollNumber(int roll_no){
    //     if(roll_no <= 0){
    //         return;
    //     }

    //     System.out.println("this = "+ this);
    //     // System.out.println("this " +this);
    //     // here this is reference to current object on which it is called 
    //     this.roll_no = roll_no;
    // }

    public void print(){
        System.out.println(name+ " "+ roll_no);
    }

}    

