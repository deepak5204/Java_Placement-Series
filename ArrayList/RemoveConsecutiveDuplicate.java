package ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
public class RemoveConsecutiveDuplicate {
    public static ArrayList<Integer> rmvConsecutivr(int[] arr){
        ArrayList<Integer> result = new ArrayList<>();
        result.add(arr[0]);

        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[i - 1]){
                result.add(arr[i]);
            }
        }

        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int[] arr = new int[sc.nextInt()];
        System.out.println("Enter array elements");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        ArrayList<Integer> result = rmvConsecutivr(arr);

        System.out.println(result);
    } 
}
