package Basic;

import java.util.Scanner;

public class IsLeapYear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = sc.nextInt();
        sc.close();
        if(year % 4 == 0){
            if(year % 100 != 0){
                System.out.println("Leap Year");
            } else if(year % 400 == 0){
                System.out.println("Leap Year");
            } else{
                System.out.println("Not Leap Year");
            }
        } else {
            System.out.println("Not Leap Year");
        }
    }
}
