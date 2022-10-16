package String;

import java.util.Scanner;

public class CheckPermutation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first string");
        String str1 = s.nextLine();

        System.out.println("Enter second string");
        String str2 = s.nextLine();
        s.close();

        if (str1.length() == str2.length()) {
            int[] freqArray = new int[256];
            // increse frequency of frequency array
            for (int i = 0; i < str1.length(); i++) {
                freqArray[str1.charAt(i)] = freqArray[str1.charAt(i)] + 1;
            }

            // decrese frequency of frequency array
            for (int i = 0; i < str1.length(); i++) {
                freqArray[str1.charAt(i)] = freqArray[str1.charAt(i)] - 1;
            }

            //check frequency
            for (int i = 0; i < freqArray.length; i++) {
                if (freqArray[i] == 1) {
                    System.out.println("false");
                    return;
                } 
            }
                System.out.println("true");
        } else {
            //  str1 length not equal to str2 length
            System.out.println("false");
        }

    }
}
