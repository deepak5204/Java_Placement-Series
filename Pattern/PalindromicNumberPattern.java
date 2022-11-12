package Pattern;

import java.util.Scanner;

public class PalindromicNumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines");
        int n = sc.nextInt();
        sc.close();
        for(int i = 1; i <= n; i++){
            //print space
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }

            //print first half number
            for(int j = i; j >= 1; j--){
                System.out.print(j);
            }

            //print second half
            for(int j = 2; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
