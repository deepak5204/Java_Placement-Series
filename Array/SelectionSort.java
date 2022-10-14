package Array;
import java.util.Scanner;
public class SelectionSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array element");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        //selection sort
      for(int i = 0; i < arr.length - 1; i++){
          int min = i;
          for(int j = i+1; j < arr.length; j++){
             if(arr[j] < arr[min]){
              min = j;
             }
          }
  
          //swap min value with first value of each iteration
          int temp = arr[min];
          arr[min] = arr[i];
          arr[i] = temp;
      }

    //print array
    for(int i = 0; i < arr.length; i++){
        System.out.print(arr[i]+" ");
    }
    }
}
