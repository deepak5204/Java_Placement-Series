package Recursion;

import java.util.Scanner;

public class CountZero {
    public static int no_of_0(int n, int count){
        if( n == 0){
            return count;
        }
        if(n%10==0){
            count++;
        }

       return no_of_0(n/10, count);
    }
         
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any integer");
        int n = s.nextInt();
        s.close();
        int res = no_of_0(n, 0);
        System.out.println("no of zero = " + res);
    }
}
