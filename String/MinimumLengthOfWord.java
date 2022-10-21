package String;

import java.util.Scanner;

public class MinimumLengthOfWord {

    public static void smallestWord(String str){
      
        String small = str;
        str = str + " ";
        String temp = "";
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ' ' ){
                temp = temp + str.charAt(i);
            } else {
                if(temp.length() < small.length()){
                    small = temp;
                }
                temp = "";
            }
            }
            System.out.println(small);
            
        }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enet string");
        String str = s.nextLine();
        s.close();
        smallestWord(str);
    }
}
