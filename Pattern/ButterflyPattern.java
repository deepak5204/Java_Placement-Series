package Pattern;

import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines");
        int n = sc.nextInt();
        sc.close();

        // print upper part
        for(int i = 1; i<= n; i++){
            for(int j = 1; j <= n*2; j++){
                if(j > i && j <= n*2 - i){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        //print lower part
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n*2; j++){
                if(j <= n-i+1 || j >= n + i){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
