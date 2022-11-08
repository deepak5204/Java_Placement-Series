package OOPs;


class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Write something!");
    }
}

 class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    //constructor
    Student(){
        // System.out.println("Normal constructor called");
    }

    // parameterized constructor
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    // copy constructor
    Student (Student s2){
        this.name = s2.name;
        this.age = s2.age;

    }
}

public class OOPs {
    public static void main(String[] args){

        /* create object of pen class */
        // Pen pen1 = new Pen();
        // pen1.color = "red";
        // pen1.type = "ballpoint";
        // pen1.write();

         /* create object of Student class */
        Student s1 = new Student();
        s1.name = "deepak";
        s1.age = 23;

        // // parameterized constructor call
        // Student st = new Student("deepak", 23);
        // st.printInfo();

        // copy constructor call
        Student s2 = new Student(s1);
        s2.printInfo();

    }
}
