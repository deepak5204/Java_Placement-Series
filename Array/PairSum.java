package Array;

public class PairSum {
    public static int pairSum(int[] arr, int x){
        int no_of_Pairs = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] + arr[j] == x){
                    if(arr[i] < arr[j]){
                        System.out.print("("+arr[i]+" "+arr[j]+")");
                    } else{
                        System.out.print("("+arr[j]+" "+arr[i]+")");
                    }
                    no_of_Pairs++;
                }
            }
        }

        return no_of_Pairs;
    }
    public static void main(String[] args){
        int[] arr = {1,3,6,2,5,4,3,2,4};
        int num = 7;

        int res = pairSum(arr, num);
        System.out.println("No of pairs = "+res);
    }
}
