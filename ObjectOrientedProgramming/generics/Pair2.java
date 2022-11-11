package ObjectOrientedProgramming.generics;

public class Pair2<S, I> {
    private S first;
    private I second;


    public Pair2(){
        
    }

    public Pair2(S first, I second){
        this.first = first;
        this.second = second;
    }

    public S getFirst(){
        return first;
    }

    public void setFirst(S value){
        this.first = value;
    }

    
    public I getSecond(){
        return second;
    }

    public void setSecond(I value){
        this.second = value;
    }
}
