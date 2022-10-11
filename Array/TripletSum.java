package Array;

public class TripletSum {
    public static int tripletSum(int[] arr, int x){
       int num_of_tripletSum = 0;
       
       for(int i = 0; i < arr.length - 2; i++){
        for(int j = i + 1; j < arr.length - 1; j++){
            for(int k = j + 1; k < arr.length; k++){
                if(arr[i] + arr[j] + arr[k] == x){
                    num_of_tripletSum++;
                    if(arr[i] <= arr[j] && arr[j] <= arr[k]){
                        System.out.println("("+arr[i]+" "+arr[j]+" "+arr[k]+")");
                    } else if(arr[i] <= arr[k] && arr[k] <= arr[j]){
                        System.out.println("("+arr[i]+" "+arr[k]+" "+arr[j]+")");
                    } else if(arr[j] <= arr[i] && arr[i] <= arr[k]) {
                        System.out.println("("+arr[j]+" "+arr[i]+" "+arr[k]+")"); 
                    } else if(arr[j] <= arr[k] && arr[k] <= arr[i]) {
                        System.out.println("("+arr[j]+" "+arr[k]+" "+arr[i]+")"); 
                    } else if(arr[k] <= arr[i] && arr[i] <= arr[j]) {
                        System.out.println("("+arr[k]+" "+arr[i]+" "+arr[j]+")"); 
                    } else if(arr[k] <= arr[j] && arr[j] <= arr[i]) {
                        System.out.println("("+arr[k]+" "+arr[j]+" "+arr[i]+")"); 
                    }
                    
                }
            }
        }
       }

       return num_of_tripletSum;
    }
    public static void main(String[] args){
        int[] arr = {1,3,6,2,5,4,3,2,4};
        int num = 12;

        int res = tripletSum(arr, num);
        System.out.println("Number of triplet sum = "+res);
    }
}
