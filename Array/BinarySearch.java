package Array;

public class BinarySearch {
    public static int bSearch(int[] arr, int x){
        int min = 0; 
        int max = arr.length - 1;
        int mid = 0;
        
        while(min < max){
             mid = min + (max - min)/2;
            if(x == arr[mid]){
                return mid;
            }
            else if(x < arr[mid]){
                max = mid - 1;
            } else{
                min = mid + 1;
            }
        }
        return mid;
    }
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5,6,7,8};
        int x = 7;

        int elementPosition = bSearch(arr, x);
        System.out.println(elementPosition);
    }
}
