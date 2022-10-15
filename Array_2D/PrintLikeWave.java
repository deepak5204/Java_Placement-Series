package Array_2D;

import java.util.Scanner;

public class PrintLikeWave {
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

        //print like wave(i.e 1st column top to bottom, 2nd column bottom to top and so on)

        for(int j = 0; j < m; j++){
            if(j % 2 == 0){
                for(int i = 0; i < n; i++){
                    System.out.print(matrix[i][j]+" ");
                }
            } else {
                for(int i = n-1; i >= 0; i--){
                    System.out.print(matrix[i][j]+" ");
                }
            }
        }

    }
}
