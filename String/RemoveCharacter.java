package String;

import java.util.Scanner;

public class RemoveCharacter {

    public static void rmvChar(String str, char ch){
        String ans = "";
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ch){
                ans += str.charAt(i);
            }
        }

        System.out.println(ans);
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String");
        String str = s.nextLine();
        System.out.println("Enter character");
        char ch = s.next().charAt(0);
        s.close();

        rmvChar(str, ch);

    }
}
