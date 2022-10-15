package String;

import java.util.Scanner;

public class PrintAllSubstring {
    public static void main(String [] args){

        Scanner s = new Scanner(System.in);

        System.out.println("Enter string");
        String str = s.next();
        for(int i = 0; i <= str.length(); i++){
            System.out.println(str.substring(i));
        }

    }
}
