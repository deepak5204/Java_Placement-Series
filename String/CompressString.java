package String;

import java.util.Scanner;

public class CompressString {

    //compress string
    public static String compString(String str){
        String ans = "";
        //create frequency array
        int[] freqArr = new int[255];
        for(int i = 0; i < str.length(); i++){
            freqArr[str.charAt(i)] += 1;
        }
        //check frequency and add in ans
        for(int i = 0; i < freqArr.length; i++){
            if(freqArr[i] != 0){
                //convert from Integer to string
                ans += (char) i + Integer.toString(freqArr[i]);
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String");
        String str = s.nextLine();
        s.close();

        String res = compString(str);
        System.out.println(res);
    }
}
