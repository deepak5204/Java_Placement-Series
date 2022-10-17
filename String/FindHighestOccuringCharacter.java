package String;

import java.util.Scanner;

public class FindHighestOccuringCharacter {

    public static char highestOccrChar(String str){

        //create frequency array
        int[] freqArr = new int[255];
        for(int i = 0; i < str.length(); i++){
            freqArr[str.charAt(i)] += 1;
        }

        int max = 0;
        int maxIdx = 0;
        for(int i = 0; i < freqArr.length; i++){
            if(freqArr[i] > max){
                max = freqArr[i];
                maxIdx = i;
            }
        }
        return (char)maxIdx;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter String");
        String str = s.nextLine();
        s.close(); 

       char res = highestOccrChar(str);

       System.out.println("Highest occuring character is : "+ res);
    }
}
