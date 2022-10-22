package Recursion;

import java.util.Scanner;

public class ImprovedMergeSort {
    public static void conquer(int[] arr, int si, int mid, int ei){

        int [] mrg = new int[ei - si + 1];
        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;
        while(idx1 <= mid && idx2 <= ei){
            if(arr[idx1] <= arr[idx2]){
                mrg[x++] = arr[idx1++];
            } else {
                mrg[x++] = arr[idx2++];
            }
        }

        while(idx1 <= mid){
            mrg[x++] = arr[idx1++];
        }
        
        while(idx2 <= ei){
            mrg[x++] = arr[idx2++];
        }

        for(int i = 0, j = si; i < mrg.length; i++, j++){
            arr[j] = mrg[i];
        }
    }

    public static void divide(int[] arr , int si, int ei){
        if(si >= ei){
            return;
        }

        int mid = si + (ei - si)/2;

        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si, mid, ei);

    } 
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        // take array input
        System.out.println("Enter array size");
        int [] arr = new int[s.nextInt()];
        System.out.println("Enter array elements");
        for(int i = 0; i < arr.length; i++){
            arr[i] = s.nextInt();
        }
        s.close();
    divide(arr,0,arr.length-1);
    //print sorted array
    for(int i = 0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
    }
    }

}
