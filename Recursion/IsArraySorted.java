package Recursion;

public class IsArraySorted {

    public static void isSorted(int[] arr, int i){
        if(i == arr. length){
            System.out.println("Array is sorted");
            return;
        }

        if(arr[i-1] > arr[i]){
            System.out.println("Array is not sorted");
            return;
        } else {
            isSorted(arr, i + 1);
        }
    }
    
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,6};

        isSorted(arr, 1);

    }
}
