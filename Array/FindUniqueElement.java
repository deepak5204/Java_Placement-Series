package Array;

import java.util.Arrays;
import java.util.Scanner;

public class FindUniqueElement {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter array size");
        int [] arr = new int[s.nextInt()];
        System.out.println("Enter array elements");
        for(int i = 0; i < arr.length; i++){
            arr[i] = s.nextInt();
        }
        s.close();

        // mergeSort(arr, 0, arr.length - 1);
        Arrays.sort(arr);
    for(int i = 0; i < arr.length; i+=2){
        if(arr[i] != arr[i+1]){
            System.out.println(arr[i]);
        }
    }

        // int ans = arr[0];
        // for(int i = 1; i < arr.length; i++){
        //     ans = ans^arr[i];
        // }

        // System.out.println(ans);
    }
}
