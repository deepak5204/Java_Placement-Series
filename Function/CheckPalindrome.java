package Function;

import java.util.Scanner;

public class CheckPalindrome {

    public static void palindromeRange(int start, int end){
        while(start <= end){
            isPalindrome(start);
            start++;
        }
    }

    public static void isPalindrome(int num) {
        int temp = num;
        int r = 0; int s = 0; 
        while(temp > 0){
            r = temp % 10;
            s = s * 10 + r;
            temp /= 10;
        }

        if( num == s){
            // System.out.println(true);
            System.out.print(num +" ");
        } 
        // else {
        //     System.out.println(false);
        // }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        sc.close();
        // isPalindrome(num);
        palindromeRange(10, 1000);
    } 
}
