package String;

import java.util.Scanner;

public class IsStringPalindrome {

    //check string is palindrome or not
    public static boolean isPalindrome(String str){
        int si = 0; 
        int ei = str.length() - 1;

        while(si <= ei){
            if(str.charAt(si) != str.charAt(ei)){
                return false;
            }
            si++;
            ei--;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter string");

        String str = s.next();
        s.close();

        boolean res = isPalindrome(str);
        System.out.println(res);
    }
}
