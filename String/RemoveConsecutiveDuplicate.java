package String;

import java.util.Scanner;

public class RemoveConsecutiveDuplicate {

    //remove consecutive duplicate
    public static String rmvConDuplicate(String str){
        char lastChar = str.charAt(0);
        String ans = ""+str.charAt(0);
        for(int i = 1; i < str.length(); i++){
            if(lastChar != str.charAt(i)){
                ans += str.charAt(i);
                lastChar = str.charAt(i);
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String");
        String str = s.nextLine();
        s.close();

        String res = rmvConDuplicate(str);
        System.out.println(res);

    }
    
}
