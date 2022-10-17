package Recursion;

import java.util.Scanner;

public class SumOfDigit {

    public static int digitSum(int num){
        if(num == 0){
            return 0;
        }

        //do small work 
        int smallSum = num % 10;
        //remaining work done by recursion
        return smallSum + digitSum(num / 10);
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        s.close();

        int res = digitSum(num);
        System.out.println("digit sum = "+ res);
    }
}
