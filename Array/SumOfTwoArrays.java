package Array;

import java.util.Scanner;

public class SumOfTwoArrays {
    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Enter first array
        System.out.println("Enter first array size");
        int[] arr1 = new int[sc.nextInt()];

        System.out.println("Enter first array elements");
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = sc.nextInt();
        }

        // Enter second array
        System.out.println("Enter second array size");
        int[] arr2 = new int[sc.nextInt()];

        System.out.println("Enter second array elements");
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = sc.nextInt();
        }
        sc.close();

        int larger = arr1.length > arr2.length ? arr1.length : arr2.length;

        int[] result = new int[larger + 1];
        int id1 = arr1.length - 1; 
        int id2 = arr2.length - 1;
        int i = result.length - 1;
        int carry = 0;

        while( i >= 0 && id1 >= 0 && id2 >= 0){
            result[i] = arr1[id1] + arr2[id2] + carry;
            if(result[i] >= 10){
                carry = result[i] / 10;
                int rem = result[i] % 10;
                result[i] = rem;
            } else {
                result[i] =  arr1[id1] + arr2[id2] + carry;
                carry = 0;
            }
            id1--;
            id2--;
            i--;
        }

        while(id1 >= 0){
            result[i] = arr1[id1] + carry;
            if(result[i] >= 10){
                carry = result[i] / 10;
                int rem = result[i] % 10;
                result[i] = rem;
            } else {
                result[i] =  arr1[id1] + carry;
                carry = 0;
            }
            id1--;
            i--;
        }

        while(id2 >= 0){
            result[i] = arr1[id2] + carry ;
            if(result[i] >= 10){
                carry = result[i] / 10;
                int rem = result[i] % 10;
                result[i] = rem;
            } else {
                result[i] =  arr2[id2] + carry;
                carry = 0;
            }
            id2--;
            i--;
        }

        result[i]= result[i]+ carry;

        printArray(result);

    }
}
