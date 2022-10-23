package Recursion;

import java.util.Scanner;

public class StairCase {
public static int countWays(int n){
    if(n == 0){
        return 1;
    } 
    else if(n < 0){
        return 0;
    }

    int x = countWays(n - 1);
    int y = countWays(n - 2);
    int z = countWays(n - 3);

    return x + y + z;
}

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no of stair");
        int n = s.nextInt();
        s.close();

        int res = countWays(n);
        System.out.println("Total ways = "+ res);
    }
}
