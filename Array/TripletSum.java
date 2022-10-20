package Array;

import java.util.Arrays;
import java.util.Scanner;

public class TripletSum {

    //Improved Triplet sum for only unique element array elements
    public static int ImpTripletSum(int[] arr, int x){

        Arrays.sort(arr);
        int i = 0; int j = 1; int k = arr.length - 1;
        int no_of_tsum = 0;
        while(j < k){
            if(arr[i]+arr[j]+arr[k]==x){
                no_of_tsum++;
                i++; j++; k--;
            }
            else if(arr[i]+arr[j]+arr[k] < x){
                i++;
                j++;
            }
            else{
                k--;
            }
        }

        return no_of_tsum;
    }
    public static int tripletSum(int[] arr, int x){
       int num_of_tripletSum = 0;
       
       for(int i = 0; i < arr.length - 2; i++){
        for(int j = i + 1; j < arr.length - 1; j++){
            for(int k = j + 1; k < arr.length; k++){
                if(arr[i] + arr[j] + arr[k] == x){
                    num_of_tripletSum++;
                    if(arr[i] <= arr[j] && arr[j] <= arr[k]){
                        System.out.println("("+arr[i]+" "+arr[j]+" "+arr[k]+")");
                    } else if(arr[i] <= arr[k] && arr[k] <= arr[j]){
                        System.out.println("("+arr[i]+" "+arr[k]+" "+arr[j]+")");
                    } else if(arr[j] <= arr[i] && arr[i] <= arr[k]) {
                        System.out.println("("+arr[j]+" "+arr[i]+" "+arr[k]+")"); 
                    } else if(arr[j] <= arr[k] && arr[k] <= arr[i]) {
                        System.out.println("("+arr[j]+" "+arr[k]+" "+arr[i]+")"); 
                    } else if(arr[k] <= arr[i] && arr[i] <= arr[j]) {
                        System.out.println("("+arr[k]+" "+arr[i]+" "+arr[j]+")"); 
                    } else if(arr[k] <= arr[j] && arr[j] <= arr[i]) {
                        System.out.println("("+arr[k]+" "+arr[j]+" "+arr[i]+")"); 
                    }
                    
                }
            }
        }
       }

       return num_of_tripletSum;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter array size");
        int [] arr = new int[s.nextInt()];

        System.out.println("Enter array elements");
        for(int i = 0; i < arr.length; i++){
            arr[i] = s.nextInt();
        }

        System.out.println("Enter the sum value");
        int sum = s.nextInt();
        s.close();

        // int res = tripletSum(arr, sum);

        //improvede triplet sum
        int res = ImpTripletSum(arr, sum);
        System.out.println("Number of triplet sum = "+res);
    }
}
