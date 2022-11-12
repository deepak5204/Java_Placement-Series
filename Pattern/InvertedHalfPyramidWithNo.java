package Pattern;

import java.util.Scanner;

public class InvertedHalfPyramidWithNo {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines");
        int n = sc.nextInt();
        sc.close();
        for(int i = 1; i <= n; i++){
           
             //print numbers
            for(int j = 1; j <= n - i + 1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
}
}
