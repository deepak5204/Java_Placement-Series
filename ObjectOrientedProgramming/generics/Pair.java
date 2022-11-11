package ObjectOrientedProgramming.generics;

// we ca define muntiple types of generics
public class Pair <T, S> {
// public class Pair <T> {
    private  T first;
    private S second;
    
    public Pair(T first, S second){
        this.first = first;
        this.second = second;
    }

    public T getFirst(){
        return first;
    }
     public void setFirst(T value){
        this.first = value;
     }
     public S getSecond(){
        return second;
    }
     public void setSecond(S value){
        this.second = value;
     }
}
