package String;

import java.util.Scanner;

public class PrintAllSubstring {
    public static void main(String [] args){

        Scanner s = new Scanner(System.in);

        System.out.println("Enter string");
        String str = s.next();
        s.close();
        for(int i = 0; i <= str.length(); i++){
            for(int j = i+1; j <= str.length(); j++){
                System.out.println(str.substring(i,j));
            }
        }

    }
}
