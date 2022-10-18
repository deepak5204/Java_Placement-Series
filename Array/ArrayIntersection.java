package Array;

import java.util.Scanner;

public class ArrayIntersection {

    // merge the array
    public static void mergeArray(int [] arr, int si, int mid, int ei){
        int[] mrg = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        //compare first half element and second half element and min element assign in mrg array
        while(i <= mid && j <= ei){
            if(arr[i] <= arr[j]){
                mrg[k] = arr[i];
                i++;
            } else {
                mrg[k] = arr[j];
                j++;
            }
            k++;
        }

        //first half array element remain
        while(i<= mid){
            mrg[k] = arr[i];
            i++;
            k++;
        }

        //second half array element remain
        while(j <= ei){
            mrg[k] = arr[j];
            j++;
            k++;
        }

        // copy sorted array element in original array
        for(int p = 0, r= si; p < mrg.length; p++, r++){
            arr[r] = mrg[p];
        }
    }

    //divide the array in two parts
    public static void divide(int[] arr, int si, int ei){
        if(si >= ei){
            return;
        }
        int mid = si + (ei - si)/ 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei); 
        mergeArray(arr, si, mid , ei);
    }

    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        //Take first array input
        System.out.println("Enter first array size");
        int[] arr1 = new int[s.nextInt()];
        System.out.println("Enter first array elements");
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = s.nextInt();
        }

        //Take second array input
        System.out.println("Enter second array size");
        int[] arr2 = new int[s.nextInt()];
        System.out.println("Enter second array elements");
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = s.nextInt();
        }
        s.close();

        divide(arr1, 0 , arr1.length - 1);
        divide(arr2, 0, arr2.length - 1);
       
       int i = 0; 
       int j = 0;

       while(i < arr1. length && j < arr2.length){
        if(arr1[i] == arr2[j]){
            System.out.print(arr1[i]);
            i++; j++;
        }
        else if(arr1[i] < arr2[j]){
            i++;
        } else {
            j++;
        }
       }
    }
}
