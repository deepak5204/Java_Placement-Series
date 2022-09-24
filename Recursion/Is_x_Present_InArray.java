package Recursion;

public class Is_x_Present_InArray {
    
    public static void isXpresent(int[] arr, int x, int i){
        if(arr.length == i){
            System.out.println(x + " is not present in the array");
            return;
        }

        isXpresent(arr, x, i+1);
        if(arr[i] == x){
            System.out.println(x +" is present in the array of index " + i);
            return;
        }

    }
    public static void main(String[] args){
        int [] arr = {1,3,5,7,4,3,2,1,4,6,3};
        int x = 6;
        isXpresent(arr, x, 0);
    }
}
