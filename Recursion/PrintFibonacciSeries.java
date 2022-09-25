package Recursion;

public class PrintFibonacciSeries {

    public static void printFibSeries(int n, int n1, int n2){
        if(n == 0){
            return;
        }
        int next = n1 + n2;
        System.out.print(next + " ");
        printFibSeries(n - 1, n2, next);
    }
    
    
    public static void main(String[] args){
        int n = 10;
        int n1 = 0;
        int n2 = 1;
        System.out.print(n1 +" "+ n2 + " ");
        printFibSeries(n-2, n1, n2);
    }
}
