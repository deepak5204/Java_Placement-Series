package Array;

import java.util.Scanner;

public class Sort_0_1_2 {

    //print array
    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int i = 0;
        int nz = 0; 
        int nt = arr.length - 1;

        while(i < arr.length && nz < nt-1 ){
            if(arr[i] == 0 ){
                int temp = arr[i];
                arr[i] = arr[nz];
                arr[nz] = temp;
                i++;
                nz++;
            } else if(arr[i] == 2){
                int temp = arr[i];
                arr[i] = arr[nt];
                arr[nt] = temp;
                nt--;
            } else {
                i++;
            }
        }

        printArray(arr);

        // //sort 0 1 2 by creating temprory array
        // int tempArr[] = new int[arr.length];
        // int si = 0, ei = arr.length - 1;
        // for(int i = 0; i < arr.length; i++){
        //     if(arr[i] == 0){
        //         tempArr[si] = arr[i];
        //         si++;
        //     }
        //     else if(arr[i] == 2){
        //         tempArr[ei] = arr[i];
        //         ei--;
        //     }
        // }

        // while(si <= ei){
        //     tempArr[si] = 1;
        //     si++;
        //     tempArr[ei] = 1;
        //     ei--;
        // }

        // //copy temp array element in original array
        // for(int i = 0; i < arr.length; i++){
        //     arr[i] = tempArr[i];
        // } 

        // //print array
        // printArray(arr);


        // //Insertion Sort
        // for(int i = 1; i < arr.length; i++){
        //     int temp = arr[i];
        //     int j = i - 1;

        //     while(j >= 0 && temp < arr[j]){
        //         arr[j+1] = arr[j];
        //         j--;
        //     }

        //     arr[j+1] = temp;
        // }

        // //sort 0 1 and 2 by using selection sort
        // for(int i = 0; i < arr.length -1; i++){
        //     int min = i;
        //     for(int j = i+1; j < arr.length; j++){
        //         if(arr[j] < arr[min]){
        //              min = j;
        //         }
        //     }
        //     int temp = arr[i];
        //     arr[i] = arr[min];
        //     arr[min] = temp;

        //     // int temp = arr[i];
        //     // arr[i] = arr[min];
        //     // arr[min] = temp;
        // }

        //print arry
        // for(int i = 0; i < arr.length; i++){
            // System.out.print(arr[i]+" ");
        // }

    }
}
