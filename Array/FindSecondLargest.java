package Array;

import java.util.Scanner;

public class FindSecondLargest {
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

        int largest = Integer.MIN_VALUE;
        int _2ndLargest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(largest <= arr[i]){
                 if(arr[i] != largest){
                    _2ndLargest = largest;
                 }
                largest = arr[i];
            }  
             else if(_2ndLargest < arr[i] ){
                _2ndLargest = arr[i];
            } 
             
        
        }

        System.out.println("Second Largest = "+ _2ndLargest);
    }
}
