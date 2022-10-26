package Recursion;

import java.util.Scanner;

public class SplitArray {

    public static boolean equalSum(int[] arr, int n , int start, int leftSum, int rightSum){
        if(start == n){
            return leftSum == rightSum;
        }

        if(arr[start] % 5 == 0){
            leftSum += arr[start];
        }
        else if(arr[start] % 3 == 0){
            rightSum += arr[start];
        }

        else {
            return equalSum(arr, n, start + 1, leftSum + arr[start], rightSum) || equalSum(arr, n, start + 1, leftSum, rightSum + arr[start]);
        }
        return equalSum(arr, n, start + 1, leftSum, rightSum);

    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Integer array size");
        int[] arr = new int[s.nextInt()];
        System.out.println("Enter array elements");
        for(int i = 0; i < arr.length; i++){
            arr[i] = s.nextInt();
        }
        s.close();

        boolean res = equalSum(arr, arr.length, 0, 0, 0);
        System.out.println(res);
    }
}
