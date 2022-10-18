package Array_2D;

import java.util.Scanner;

public class HourglassMaxSum{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[][] arr = new int[6][6];

        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                arr[i][j] = s.nextInt();
            }
        }
        s.close();

        //max hourglass sum
       int res = hourglassSum(arr);
       System.out.println(res);

    }

    public static int hourglassSum(int[][] arr){
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < 4; i++){
            int sum = 0;
            for(int j = 0; j < 4; j++){
                sum += arr[i][j];
                if(maxSum < sum){
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }
}