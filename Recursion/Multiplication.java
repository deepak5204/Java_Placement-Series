package Recursion;

import java.util.Scanner;

public class Multiplication {

    public static int calcProd(int m, int n){
        if(n == 0){
            return 0;
        }

        int smallRes = calcProd(m, n-1);
        return m + smallRes; 
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value of n");
        int  n = s.nextInt();
        System.out.println("Enter value of m");
        int m = s.nextInt();
        s.close();
        int res = calcProd(m,n);
        System.out.println(res);
    }
}
