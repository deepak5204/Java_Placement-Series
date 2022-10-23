package Recursion;

import java.util.Scanner;

public class PrintStarbetweenPair {

    public static String pairStar(String s, String newStr, int i) {
      if(i == s.length()){
        return newStr;
      }

      if(s.charAt(i - 1) == s.charAt(i)){
        newStr += "*" + s.charAt(i);
      } else {
        newStr += s.charAt(i);
      }
      // System.out.println(newStr);

      return pairStar(s, newStr, i + 1);

      // return newStr;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any string");
        String str = s.nextLine();
        s.close();
        String newStr = "" + str.charAt(0);
        String res = pairStar(str, newStr, 1 );
        System.out.println(res);
    }
}
