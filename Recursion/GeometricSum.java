package Recursion;

import java.util.Scanner;

public class GeometricSum {
    
    public static double calcPower(int n, int x){
        if(n == 1 || x == 0){
            return 1;
        }
        double smallValue = calcPower(n, x - 1);
        return smallValue * n;
    }
    public static double calcGeomatricSum(int k){
        if(k == 0){
            return 1 ;
        }
       
        //do small work i calculate only (1/2^k)
        double sum = 1/calcPower(2, k);
        //remaining sum calculate recursion and add in small work
        return sum + calcGeomatricSum(k - 1);
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the value of k");
        int k = s.nextInt();
        s.close();
        
        double res = calcGeomatricSum(k);
        System.out.println("Geometric sum = "+ res);
        
    }
}
