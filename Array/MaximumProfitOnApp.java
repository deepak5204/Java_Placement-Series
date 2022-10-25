package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumProfitOnApp {

    public static int decideAppPrice(int[] list){
        int maxProfit = 0;

        for(int i = 0;  i < list.length; i++){
            int price = list[i];
            int profit = price * (list.length - i);
            if(profit > maxProfit){
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args){
        Scanner s = new Scanner (System.in); 
        System.out.println("Enter no of subscriber");
        int n = s.nextInt();

        int[] list = new int[n];

        System.out.println("Enter budget of the subscribers");
        for(int i = 0; i < list.length; i++){
            list[i] = s.nextInt();
        }
        s.close();
        
        Arrays.sort(list);
        int res = decideAppPrice(list);
        System.out.println("App price is : "+ res);
    }
    
}
