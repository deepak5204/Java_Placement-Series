package Recursion;

import java.util.Scanner;

public class PrintAllSubstring {
    public static void printSubstring(String str){
        if(str.length() == 0){
            return;
        }

        System.out.println(str);
        printSubstring(str.substring(1));
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any string");
        String str = new String(s.nextLine());
        s.close();
        printSubstring(str);

    }
}
