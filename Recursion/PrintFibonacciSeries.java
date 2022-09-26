package Recursion;

public class PrintFibonacciSeries {

    //print fibonacci series here n1 is first term and n2 is second term
    public static void printFibSeries(int n, int n1, int n2){
        if(n == 0){
            return;
        }
        int next = n1 + n2;
        System.out.print(next + " ");
        printFibSeries(n - 1, n2, next);
    }

    //print sum of n number of fibonacci series
        public static int printFib(int n){
        if(n == 1 || n == 2){
            return 1;
        }

        int fib_nm1 = printFib(n - 1);
        int fib_nm2 = printFib(n - 2);
        return fib_nm1 + fib_nm2;
    }

    
    
    public static void main(String[] args){
        int n = 10;
        int n1 = 0;
        int n2 = 1;
        System.out.print(n1 +" "+ n2 + " ");
        printFibSeries(n-2, n1, n2);

        //print sum of n number of fibonacci series
        System.out.println("\n sum of " + n +" fibonacci number : " + printFib(n));
    }
}
