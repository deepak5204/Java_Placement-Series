package OOPs.pureAbstract;

interface Animal {
public void walk();
}

interface Herbivore{

}

// multiple Inheritance
class Horse implements Animal, Herbivore{
    public void walk(){
        System.out.println("walks on four legs");
    }
}

public class P_abstract {
    public static void main(String[] args){

    }
    
}
