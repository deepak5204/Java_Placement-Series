package String;

import java.util.Scanner;

public class CountWord {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter string ");
        String str = s.nextLine();
        s.close();

        int count = 1;
        for(int i = 0 ; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                count++;
            }
        }

        System.out.println(str);
        System.out.println("Total words : " + count);
    }
}
