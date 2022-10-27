package ObjectOrientedProgramming.classandobjects;

public class Student {
    String name;
    private    int roll_no;
    
    public int getRollNumber(){
        return roll_no;
    }
    
    public void setRollNumber(int roll_no){
        if(roll_no <= 0){
            return;
        }

        System.out.println("this = "+ this);
        // System.out.println("this " +this);
        // here this is reference to current object on which it is called 
        this.roll_no = roll_no;
    }

}    

