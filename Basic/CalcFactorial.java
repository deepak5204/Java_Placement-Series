package Basic;

import java.util.Scanner;

public class CalcFactorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        sc.close();
        int fact = 1;

        for(int i = 1; i <= n; i++){
                fact *= i;
        }
        System.out.println("Factorial value = "+ fact);
    }
}
