package Recursion;

public class CalculateArraySum {
    public static int arraySum(int[] arr, int i){
        if(i == arr.length ){
            return 0;
        }

        int smallArraySum = arraySum(arr, i + 1);
        return arr[i] + smallArraySum;
    }
    public static void main(String[] args){
        int [] arr = {1,3,5,6,7,4,3,2,1,4,6,3};
        int res = arraySum(arr, 0);
        System.out.println("Array sum = "+ res);
    }
}
