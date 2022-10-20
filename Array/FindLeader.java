package Array;

import java.util.Scanner;

public class FindLeader{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter array size");
        int[] arr = new int[s.nextInt()];
        System.out.println("Enetr array elements");
        for(int i = 0; i < arr.length; i++){
            arr[i] = s.nextInt();
        }
        s.close();

        //print leaders
        int min = arr[arr.length - 1];
        System.out.print(min + " ");
        for(int i = arr.length - 2; i >= 0; i--){
            if(arr[i] > min){
                System.out.print(arr[i] + " ");
                min = arr[i];
            } 
        }
    }
}