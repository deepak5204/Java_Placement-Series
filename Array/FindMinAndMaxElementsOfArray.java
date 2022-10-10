package Array;

public class FindMinAndMaxElementsOfArray {

    public static void main(String[] args){
        int[] arr = {3,5,7,9,6,-1,8,11,-23};

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;


        for(int i = 1; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
            if(max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println("min = "+ min);
        System.out.println("max = "+max);

    }
    
}
