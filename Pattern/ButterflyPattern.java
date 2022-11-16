package Pattern;

import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines");
        int n = sc.nextInt();
        sc.close();


        //print Upper part
        //outer loop
        for(int i = 1; i <= n; i++){

            //print star
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }

            //print spaces
            for(int j = 1; j <= 2 * (n-i); j++){
                System.out.print(" ");
            }

            //print star
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

// print lower part (Mirror image of upper part)
//outer loop
for(int i = n; i >= 1; i--){

    //print star
    for(int j = 1; j <= i; j++){
        System.out.print("*");
    }

    //print spaces
    for(int j = 1; j <= 2 * (n-i); j++){
        System.out.print(" ");
    }

    //print star
    for(int j = 1; j <= i; j++){
        System.out.print("*");
    }
    System.out.println();
}

        // // print upper part
        // for(int i = 1; i<= n; i++){
        //     for(int j = 1; j <= n*2; j++){
        //         if(j > i && j <= n*2 - i){
        //             //print spaces
        //             System.out.print(" ");
        //         } else {
        //             //print star
        //             System.out.print("*");
        //         }
        //     }
        //     System.out.println();
        // }


        // // print lower part
        // for(int i = n; i>= 1; i--){
        //     for(int j = 1; j <= n*2; j++){
        //         if(j > i && j <= n*2 - i){
        //             //print spaces
        //             System.out.print(" ");
        //         } else {
        //             //print star
        //             System.out.print("*");
        //         }
        //     }
        //     System.out.println();
        // }


        // //print lower part
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= n*2; j++){
        //         if(j <= n-i+1 || j >= n + i){
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }
    }
}
