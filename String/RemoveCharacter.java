package String;

import java.util.Scanner;

public class RemoveCharacter {

    
    // //remove character using extra string
    // public static void rmvChar(StringBuffer str, char ch){
    //     String ans = "";
    //     for(int i = 0; i < str.length(); i++){
    //         if(str.charAt(i) != ch){
    //             ans += str.charAt(i);
    //         }
    //     }

    //     System.out.println(ans);
    // }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String");
        // StringBuffer str = new StringBuffer(s.nextLine());
        String str = s.nextLine();
        System.out.println("Enter character");
        char ch = s.next().charAt(0);
        s.close();

        // //remove character using extra string
        // rmvChar(str, ch);

        // char[] chArr = str.toCharArray();

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ch){
               
            }
        }

    }
}
