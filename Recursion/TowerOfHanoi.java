package Recursion;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void TOH(int n, String source, String helper, String dest){
        if(n == 1){
            System.out.println("Transform disk " + n +" from "+ source + " to " + dest);
            return;
        }

        //move n-1 disk form source to helper using destination as a helper
        TOH(n-1, source, dest, helper);

        System.out.println("Transform disk " + n +" from " + source + " to " + dest);

        //move n-1 disk form helper to destination using source as a helper
        TOH(n-1, helper, source, dest);
    }
    public static void main(String[] args){
     Scanner s = new Scanner(System.in);
     System.out.println("Enter no of disk");
     int n = s.nextInt();
     s.close();
    TOH(n, "S", "H", "D");        

    }
}
