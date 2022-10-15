package Array_2D;

import java.util.Scanner;

public class CalculateSumOfBoundariesAndDiagonals {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row");
        int n = sc.nextInt();
        System.out.println("Enter no of column");
        int m = sc.nextInt();

        int[][] matrix = new int[n][m];
        System.out.println("Enter matrix elements");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();

        
        int sum = 0;

        //sum of boundaries and diagonals
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){

             //sum  of first row
              if(i == 0 ){
                sum += matrix[i][j];
              }

              
             //sum  of last row
             else if(i == n-1 ){
                sum += matrix[i][j];
              }

              
             //sum  of first column
             else if(j == 0 ){
                sum += matrix[i][j];
              }
              
              
             //sum  of last column
             else if(j == m-1 ){
                sum += matrix[i][j];
              }

              //sum of first diagonal
              else if(i == j ){
                sum += matrix[i][j];
              }

               //sum of second diagonal
               else if(i + j == n-1 ){
                sum += matrix[i][j];
              }
            }
        }

        System.out.println("sum = "+ sum);

    }
}
