package String;

import java.util.Scanner;

public class ReverseStringWordWise {
    public static String revStrWW(StringBuffer str){
        String ans = "";
        int currWordEnd = str.length() - 1;
        int i = str.length() - 1;
        for(; i >= 0; i--){
            if(str.charAt(i) == ' '){
                String currWord = "";
                for(int j = i + 1; j <= currWordEnd; j++){
                    currWord += str.charAt(j);
                }
                
                ans += currWord + " ";
                currWordEnd = i - 1;
            }
        }
        String currWord = "";
        for(int j = i + 1; j <= currWordEnd; j++){
            currWord += str.charAt(j);
        }
        
        ans += currWord + " ";
        currWordEnd = i - 1;

        return ans;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String ");
        StringBuffer str = new StringBuffer(s.nextLine());

        System.out.println(revStrWW(str));

        s.close();
    }
}
