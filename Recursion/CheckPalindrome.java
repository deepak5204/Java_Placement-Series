package Recursion;

import java.util.Scanner;

public class CheckPalindrome {
    public static boolean isPalindrome(String str) {
        if (str.length() == 0 || str.length() == 1) {
            return true;
        }

        //do small work
        if (str.charAt(0) != str.charAt(str.length() - 1)) { 
            return false;
        } 

        String newStr = str.substring(1, str.length() - 1);
        // remaining work done by recursion
        return isPalindrome(newStr);

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter String");
        String str = s.nextLine();
        s.close();

        boolean res = isPalindrome(str);

        if(res){
            System.out.println(str + " is palindrom");
        } else{
            System.out.println(str + " is not palindrom");
        }
    }
}
