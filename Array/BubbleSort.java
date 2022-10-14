package Array;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int [] arr = new int[n];

        //Enter array element 
        System.out.println("Enter array element");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        //bubble sort 
        for(int i = 0; i < n; i++){
            for(int j = 1; j < n - i; j++){
                if(arr[j - 1] > arr[j]){
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        //print sorted array
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
