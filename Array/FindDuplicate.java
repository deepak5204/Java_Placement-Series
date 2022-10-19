package Array;

import java.util.Arrays;
import java.util.Scanner;

public class FindDuplicate {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter array size");
        int[] arr = new int[s.nextInt()];
        System.out.println("Enetr array elements ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = s.nextInt();
        }
        s.close();

        //by sorting the array
        // Arrays.sort(arr);
        // for(int i = 1; i < arr.length; i++){
        //     if(arr[i-1] == arr[i]){
        //         System.out.println(arr[i]);
        //         return;
        //     }
        // }

        //total sum of array 
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum+=arr[i];
        }

        // sum of n-1 element
        int nm1Sum = 0;
   
            nm1Sum = (arr.length - 2 * arr.length -1) / 2 ;
   

    //duplicate element is 
    System.out.println(sum - nm1Sum);

     }
    
}
