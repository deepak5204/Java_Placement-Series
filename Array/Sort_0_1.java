package Array;

public class Sort_0_1 {
    public static void main(String[] args){
        int [] arr = {0,1,1,0,1,0,1};

        int si = 0; 
        int ei = arr.length - 1;

        while(si < ei){
            if(arr[si] == 0){
                si++;
            } else {
                if(arr[ei] == 1){
                    ei--;
                } else{
                    int temp = arr[si];
                    arr[si] = arr[ei];
                    arr[ei] = temp;
                    si++;
                    ei--;
                }
            }
        }

        //print array
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}
