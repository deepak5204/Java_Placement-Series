package Pattern;

import java.util.Scanner;

public class Print_0_1_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter number of lines");
        int n = sc.nextInt();
        sc.close();
        int num = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print( num +" ");
                if(num == 1) num = 0;
                else num = 1;
            }
            System.out.println();
        }

    }
}
