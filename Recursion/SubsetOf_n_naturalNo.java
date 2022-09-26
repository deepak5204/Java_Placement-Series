package Recursion;
import java.util.ArrayList;


public class SubsetOf_n_naturalNo {
    public static void printSubset(ArrayList<Integer> subset){
        for(int i = 0; i < subset.size(); i++){
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    } 
    public static void printSubset(int n, ArrayList<Integer> subset){
        if(n == 0){
            // System.out.println(subset);
            printSubset(subset);
            return;
        }

        //add in list
        subset.add(n);
        printSubset(n - 1, subset);

        //not add in list 
        subset.remove(subset.size() - 1);
        printSubset(n - 1, subset);
    
    }
    public static void main(String[] args){
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        printSubset(n, subset);
    }
}
