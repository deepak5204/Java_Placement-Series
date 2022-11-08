package OOPs;

class Student2{
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name, int age){
        System.out.println(name+" "+age);
    }

}
public class Polymorphism {
    public static void main(String[] args){
        Student2 s1 = new Student2();

        s1.name = "deepak";
        s1.age = 23;

        s1.printInfo(s1.name);
        s1.printInfo(s1.age);
        s1.printInfo(s1.name, s1.age);
    }
}
