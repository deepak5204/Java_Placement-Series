package Recursion;

public class QuickSort {

    public static int partition(int[] arr, int si, int ei){
        int pivotElement = arr[si];
        int smallNumCount =0; 

        // count number of element less than pivot element
        for(int i = si; i <= ei; i++){
            if(arr[i] < pivotElement){
                smallNumCount++;
            }
        }

        //swap pivot element to its correct position
        int temp = arr[si + smallNumCount];
        arr[si + smallNumCount] = pivotElement;
        arr[si] = temp;

        // move small element before pivot element and large after pivot element
        int i = si;
        int j = ei;
        while(i < j){
            if(arr[i] < pivotElement){
                i++;
            } else if(arr[j] >= pivotElement){
                j--;
            } else {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp; 
                    i++;
                    j--;
                }
        }
        return si + smallNumCount;

    }

    public static void qsort(int[] arr, int si, int ei){
        if(si >= ei){
            return;
        }

        int pivotIndex = partition(arr, si, ei);
        qsort(arr, si, pivotIndex - 1);
        qsort(arr, pivotIndex + 1, ei);

    }
    public static void main(String[] args){

        int[] arr = {3,4,5,1,7,8,6};

        qsort(arr, 0, arr.length - 1);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
