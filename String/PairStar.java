package String;

import java.util.Scanner;

public class PairStar {

    public static String addStar(String str){
        String newStr = "" + str.charAt(0);

        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i - 1) == str.charAt(i)){
                newStr += "*" + str.charAt(i);
            } else{
                newStr += str.charAt(i);
            }
        }

        return newStr;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any string");
        String str = s.nextLine();
        s.close();

        String res = addStar(str);
        System.out.println(res);
    }
}
