package Recursion;

import java.util.Scanner;

public class MinimumCountToMakePerfectSquare {
    public static int minSquare(int n){
        if(n <= 3){
            return n;
        }

        int ans = Integer.MAX_VALUE;
        for(int i = 1; i*i <= n; i++){
            ans = Math.min(ans, 1 + minSquare(n - i * i));
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any integer");
        int n = s.nextInt();
        s.close();

        int res = minSquare(n);
        System.out.println(res);
    }
}
