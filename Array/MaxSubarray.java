package Array;

import java.util.Scanner;

public class MaxSubarray {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array");
        int arr[] = new int[s.nextInt()];

        System.out.println("Enter array elements");
        for(int i = 0; i < arr.length; i++){
            arr[i] = s.nextInt();
        }
        s.close();

        int currentMax = Integer.MIN_VALUE;
        //subarray
        for(int i = 0; i < arr.length ; i++){
            int max = 0;
            for(int j = i; j < arr.length ; j++){
                 max = max +arr[j];
                 if(max > currentMax){
                    currentMax = max;
                 }
            }
        }

        System.out.println("Maximum subarray sum = "+ currentMax);
    }
}
