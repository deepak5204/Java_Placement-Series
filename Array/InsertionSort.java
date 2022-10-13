package Array;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        // take input in array
        System.out.println("Enter array elements");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        // sc.close();

        //Insertion sort
        for(int i = 0; i < arr.length; i++){
            int temp = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] < temp){
                arr[j + 1] = arr[j];
                j--;
            }

            //pacement of element
            arr[j+1] = temp;
        }

        //print array
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
