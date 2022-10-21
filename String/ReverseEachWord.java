package String;

import java.util.Scanner;

public class ReverseEachWord {

    // reverse string word wise
    public static String revEachWord(StringBuffer str) {
        String ans = "";
        int i = 0;
        int currentWordStart = 0;
        for (; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
            //reverse current word
            int currentWordEnd = i - 1;
            String reversedWord = "";

                for (int j = currentWordStart; j <= currentWordEnd; j++) {
                    reversedWord = str.charAt(j) + reversedWord;
                }
                ans = reversedWord + " " + ans + " ";
                currentWordStart = i + 1;
            }
        }
        int currentWordEnd = i - 1;
            String reversedWord = "";

                for (int j = currentWordStart; j <= currentWordEnd; j++) {
                    reversedWord = str.charAt(j) + reversedWord;
                }
                ans = reversedWord + " " + ans + " ";
        return ans;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter string ");
        StringBuffer str = new StringBuffer(s.nextLine());
        s.close();

        // System.out.println(str);

        
        System.out.println( revEachWord(str) );

    }
}
