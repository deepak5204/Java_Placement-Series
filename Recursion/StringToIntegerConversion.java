package Recursion;

import java.util.Scanner;

public class StringToIntegerConversion {

    public static int stringToInt(String str){
       if(str.length() == 1){
        return str.charAt(0) - '0';
       }

       int recVal = stringToInt(str.substring(1));

    //    do small work with first character of a string  and store in small value
       int smallval = str.charAt(0) - '0';

       //find no position
       int pos = 1;
       for(int i = 0; i < str.length()-1; i++){
            pos = pos * 10;
       }
    //    move no into its own position
       smallval = pos * smallval; 
       return smallval + recVal;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any string");
        String str = s.nextLine();
        s.close();

        int res =  stringToInt(str);
        System.out.println(res);
    }
}
