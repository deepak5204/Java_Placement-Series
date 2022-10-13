package Array;
import java.util.Scanner;
public class SelectionSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter array element");
        for(int i = 0; i < 5; i++){
            arr[i] = sc.nextInt();
        }

      for(int p = 0; p < 5; p++){
          //find minimum element 
          int mi = p;
          for(int i = p+1; i < 5; i++){
             if(arr[p] > arr[i]){
              mi = i;
             }
          }
  
          //swap min value with first value of each iteration
          int temp = arr[p];
          arr[p] = arr[mi];
          arr[mi] = temp;
      }

    //print array
    for(int i = 0; i < 5; i++){
        System.out.print(arr[i]+" ");
    }
    }
}
