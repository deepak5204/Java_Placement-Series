package Array;

import java.util.Scanner;


public class IsArrayContainDuplicate {

    //check array contain duplicate or not, if array contain duplicate return true otherwise return false
    public static boolean arrConDuplicate(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array");
    int n = sc.nextInt();
    int [] arr = new int[n];
    System.out.println("Enter array elements");
    for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
    }
    sc.close();

    boolean res = arrConDuplicate(arr);
    System.out.println(res);
   }
}
