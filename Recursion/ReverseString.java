package Recursion;

public class ReverseString {

    public static void revString(String str, String newStr, int idx){
        if(idx == 0){
            newStr += str.charAt(idx);
            System.out.println(newStr);
            return ;
        }

        char currChar = str.charAt(idx);

        revString(str, newStr + currChar, idx - 1);
        return;
    }
    public static void main(String[] args){
        String str = "abcde";
        revString(str, "", str.length() - 1);
        // System.out.println();
    }
}
