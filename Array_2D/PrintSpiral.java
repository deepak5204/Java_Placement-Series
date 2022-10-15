package Array_2D;

import java.util.Scanner;

public class PrintSpiral {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of row");
        int n = s.nextInt();
        System.out.println("Enter no of column");
        int m = s.nextInt();

        int[][] matrix = new int[n][m];
        System.out.println("Enter matrix elements");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                matrix[i][j] = s.nextInt();
            }
        }
        s.close();
      if(matrix.length == 0){
        return;
      } else {
        int i = 1;
        int sr = 0; 
        int er = n;
        int sc = 0;
        int ec = m;
        
        while(i <= n * m){    
            //upper column movement
            for(int r = sc; r < ec; r++){
                System.out.print(matrix[sr][r]+" ");
                i++;
            }
            sr++;

              //right row movement
            for(int r = sr; r < er; r++){
                System.out.print(matrix[r][ec-1]+" ");
                i++;
            }
            ec--;

            //bottom column movement
            for(int r = ec - 1; r >= sc; r--){
                System.out.print(matrix[er-1][r]+" ");
                i++;
            }
            er--;

            //left row movement
            for(int r = er - 1; r >= sr; r--){
                System.out.print(matrix[r][sc]+" ");
                i++;
            }
            sc++;
        }
      }

    }
}
