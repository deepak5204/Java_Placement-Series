package Recursion;

import java.util.Scanner;

public class CountZero {
    public static int no_of_0(int n){
        if( n == 0){
            return 1;
        } else if(n <= 9){
            return 0;
        }
      

       int s = no_of_0(n/10);
       if(n % 10 == 0){
        return s + 1;
       }
       return s;
    }
         
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any integer");
        int n = s.nextInt();
        s.close();
        int res = no_of_0(n);
        System.out.println("no of zero = " + res);
    }
}
