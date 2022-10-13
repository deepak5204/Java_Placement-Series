package Array;

import java.util.Scanner;

public class Push_0_to_end {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int [] arr = new int[5];

        //Enter array element 
        System.out.println("Enter array element");
        for(int i = 0; i < 5; i++){
            arr[i] = sc.nextInt();
        }

        int [] newArr = new int[arr.length];
        int si = 0; 
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                newArr[si] = arr[i];
                si++;
            }
        }

        //print array
        for(int i = 0; i < arr.length; i++){
            System.out.print(newArr[i]+" ");
        }
    }
}
