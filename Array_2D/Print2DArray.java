/* Given a 2D integer array with n rows and m columns. Print the 0th row from input n times, 1st row n-1 times…..(n-1)th row will be printed 1 time. */


package Array_2D;

import java.util.Scanner;

public class Print2DArray {

    public static void printArr(int[][] arr){
        for(int i = 0; i< arr.length; i++){
            for(int k = 0; k< arr.length - i; k++){
                for(int j = 0; j < arr[1].length; j++){
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
            // System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner s  = new Scanner(System.in);
        System.out.println("Enter no of row and  column");
        int row = s.nextInt();
        int col = s.nextInt();
        int[][] arr = new int[row][col];
        
        System.out.println("Enter elements of array");
        for(int i = 0; i< row; i++){
            for(int j = 0; j < col; j++){
                arr[i][j] = s.nextInt(); 
            }
        }
        s.close();

       printArr(arr);

    }
}
