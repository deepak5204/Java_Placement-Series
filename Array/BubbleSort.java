package Array;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int [] arr = new int[5];

        //Enter array element 
        System.out.println("Enter array element");
        for(int i = 0; i < 5; i++){
            arr[i] = sc.nextInt();
        }

        //bubble sort 
        for(int i = 0; i < 5; i++){
            for(int j = 1; j < 5 - i; j++){
                if(arr[j - 1] > arr[j]){
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        //print sorted array
        for(int i = 0; i < 5; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
