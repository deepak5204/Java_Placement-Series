package ObjectOrientedProgramming.classandobjects;

public class StudentUse {
    public static void main(String[] args){
        Student s1 = new Student("Tonny");
        Student s2 = new Student("john");   
        s2.print();
        s1.print();
        // System.out.println(s1.numStudent);
        // System.out.println(s2.numStudent);
        // Student s3 = new Student();
        System.out.println(Student.getNumStudent());


        // s3.print();





        // s1.print();
        // s2.print();
        // s1.setRollNumber(100);
        // System.out.println("s1 = "+ s1);
        // System.out.println(s1.name +" "+ s1.getRollNumber());
        
        // System.out.println("s1 " + s1);
        // s2.name = "vivek";
        // s2.roll_no = 39;
        // System.out.println(s2.name +" "+ s2.roll_no);
    }
}
