package Array;

import java.util.Scanner;

public class RotateArray {

    public static void reverse(int[] arr, int si, int ei){
        while(si < ei){
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            si++;
            ei--;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] arr = {1, 2, 3, 4, 5, 6};

        System.out.println("Enter Array rotation times");
        int d = sc.nextInt();
        sc.close();

        //reverse array 
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, arr.length - 1 - d);
        reverse(arr, arr.length -d, arr.length-1);



        // //move element by d to start position

        // //create a new array for store element from start to d
        // int [] newArr = new int[d];
        // for(int i = 0; i < d; i++){
        //     newArr[i] = arr[i];
        // }

        // // move element from d to start
        // int p = 0;
        // while(p < arr.length - d){
        //     arr[p] = arr[p + d];
        //     p++;
        // }

        // //copy elements from newArr to original array
        // for(int i = 0; i < newArr.length; i++){
        //     arr[p] = newArr[i];
        //     p++;
        // }





    //     // Rotate array by single position each round
    //    int i = 0; 
    //    while(i < d){
    //     int temp = arr[0];
    //     for(int j = 0; j < arr.length - 1; j++){
    //         arr[j] = arr[j + 1];
    //     }
    //     arr[arr.length - 1] = temp;
    //     i++;
    //    }


        //print array
        for(int k = 0; k < arr.length; k++){
            System.out.print(arr[k]+" ");
        }


        
        // for(int i = num ; i < arr.length; i++){
        //     System.out.print(arr[i]+" ");
        // }

        // for(int i = 0; i < num; i++){
        //     System.out.print(arr[i]+" ");
        // }

    }
    }
