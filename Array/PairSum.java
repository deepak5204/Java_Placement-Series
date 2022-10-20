package Array;

import java.util.Arrays;
import java.util.Scanner;

public class PairSum {
    //improved pair sum
    public static int ImpPairSum(int[] arr, int x){
        int no_of_pair = 0;
        Arrays.sort(arr);
        int si = 0; 
        int ei = arr.length - 1;

        while(si < ei){
            if(arr[si] + arr[ei]  == x){
                no_of_pair++;
                si++;
            } else if(arr[si] + arr[ei]  == x){
                no_of_pair++;
                si++;
            }
             else  if(arr[si] + arr[ei]  < x){
                si++;
             } else {
                ei--;
             }
        }

        return no_of_pair;
    }


    //brute force approach (time complexity - O(n))
    public static int pairSum(int[] arr, int x){
        int no_of_Pairs = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] + arr[j] == x){
                    if(arr[i] < arr[j]){
                        System.out.println("("+arr[i]+" "+arr[j]+")");
                    } else{
                        System.out.println("("+arr[j]+" "+arr[i]+")");
                    }
                    no_of_Pairs++;
                }
            }
        }

        return no_of_Pairs;
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

        int res = pairSum(arr, sum);

        //improved pair sum
        // int res = ImpPairSum(arr, sum);
        System.out.println("No of pairs = "+res);
    }
}
