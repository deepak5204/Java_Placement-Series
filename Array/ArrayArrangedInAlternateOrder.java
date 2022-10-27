package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayArrangedInAlternateOrder {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter array size");

        int[] arr = new int[s.nextInt()];

        System.out.println("Enter array elements");
        for(int i = 0; i < arr.length; i++){
            arr[i] = s.nextInt();
        }
        s.close();

        Arrays.sort(arr);

        int i = 0, j = arr.length - 1;

        int arr2[]  = new int[arr.length];
        int k = 0;
        while( k < arr.length){
            if(k % 2 == 0){
                arr2[k] = arr[j--];
            } else{
                arr2[k] = arr[i++];
            }
            k++;
        }

        for( int p = 0; p < arr2.length; p++){
            System.out.print(arr2[p]+" ");
        }
    }
}
