
/* 
 * The string begins with 'a'
 * Each 'a' is followed by nothing or an 'a' or "bb"
 * Each "bb" is followed by nothing or an 'a'
 */


package Recursion;

import java.util.Scanner;

public class CheckAB {
    public static boolean isAB_true(String s){
        if(s.length() == 0){
            return true;
        }
        if(s.charAt(0) == 'a'){
            if(s.substring(1).length() > 1 && s.charAt(1) == 'b' && s.charAt(2) == 'b'){
                return isAB_true(s.substring(3));
            } else {
                isAB_true(s.substring(1));
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter string of ab");
        String str = s.nextLine();
        str =str.toLowerCase();
        s.close();

       boolean result =  isAB_true(str );
       System.out.println(result);
    }
}
