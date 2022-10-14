package Array;

import java.util.Scanner;

public class CheckArrayRotation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter array elements");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        int rot = Integer.MAX_VALUE;
        int rotation = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < rot){
                rot = arr[i];
                rotation = i;
            }
        }

        System.out.println("array rotation is = "+ rotation);
    }
}
