package Pattern;

import java.util.Scanner;

public class PrintSolidRhombus{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines");
        int n = sc.nextInt();
        sc.close();

        for(int i = 1; i <= n; i++){

            //print space
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }

            //print star
            for(int j = 1; j <= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}