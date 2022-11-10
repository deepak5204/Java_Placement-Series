package Basic;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        sc.close();
        if (n == 2) {
            System.out.println(n + " is prime number.");
        } else {
            boolean prime = true;
            int i = 2;
            do {
                if (n % 2 == 0) {
                    prime = false;
                }
                i++;
            } while (i <= Math.sqrt(n));

            if (prime) {
                System.out.println(n + " is prime number.");
            } else {
                System.out.println(n + " is not prime number.");
            }
        }
    }
}
