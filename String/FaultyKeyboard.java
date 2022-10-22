package String;

import java.util.Scanner;

public class FaultyKeyboard {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter string what you want to write");
        String str = s.nextLine();
        System.out.println("Enter computer generated faulty word");
        String fstr = s.nextLine();
        s.close();
      
        int i = 0;
        int j = 0;
        while (i < str.length() && j < fstr.length()) {
            if (str.charAt(i) == fstr.charAt(j)) {
                i++;
                j++;
            } else if (fstr.charAt(j) == fstr.charAt(j - 1)) {
                j++;
            } else {
                System.out.println("false");
                return;
            }
        }

        System.out.println("true");
    }
}
