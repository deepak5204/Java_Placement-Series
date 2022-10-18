package Array;

import java.util.Scanner;

public class EquilibriumIndex {

    public static void equIndex(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int sum1 = 0;
            int sum2 = 0;

            //calculate first half sum
            for(int j = 0; j < i; j++){
                sum1 += arr[j];
            }

            //calculate second half sum
            for(int j = i + 1; j < arr.length; j++){
                sum2 += arr[j];
            }

            if(sum1 == sum2){
                System.out.println(i);
                return ;
            }
        }

    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        //Take array input
        System.out.println("Enter first array size");
        int[] arr = new int[s.nextInt()];
        System.out.println("Enter first array elements");
        for(int i = 0; i < arr.length; i++){
            arr[i] = s.nextInt();
        }
        s.close();

        //find equilibrium index
    //    equIndex(arr);

    int lsum = 0; 
    int rsum = 0;
    //calculate right sum
    for(int i = 0; i < arr.length ; i++){
        rsum += arr[i];
    }

    for(int i = 0; i < arr.length ; i++){
        if(i > 0){
            lsum += arr[i - 1];
        }
        rsum -= arr[i];

        if(lsum == rsum){
            System.out.println(i);
            return;
        }  
    }

    System.out.println(-1);


    }
}
