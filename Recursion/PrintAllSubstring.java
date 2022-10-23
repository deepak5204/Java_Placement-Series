package Recursion;

import java.util.Scanner;

public class PrintAllSubstring {
    public static void printSubstring(String str, int i, String subStr){
        if(str.length() == i){
            System.out.println(subStr);
            return;
        }
        char currChar = str.charAt(i);

        printSubstring(str, i + 1, subStr + currChar);
        printSubstring(str, i + 1, subStr);
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any string");
        String str = new String(s.nextLine());
        s.close();
        printSubstring(str, 0, "");

    }
}
