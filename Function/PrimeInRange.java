package Function;

import java.util.Scanner;

public class PrimeInRange {
    public static void checkPrime(int num){
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return;
            }
        }
        System.out.print(num + " ");
    }

    public static void printPrime(int startNum, int endNum){
        while(startNum <= endNum){
            checkPrime(startNum);
            startNum++;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int startNum = sc.nextInt();
        int endNum = sc.nextInt();
        sc.close();
        printPrime(startNum, endNum);
    }
}
