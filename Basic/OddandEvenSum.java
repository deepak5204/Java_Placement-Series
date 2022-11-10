package Basic;

import java.util.Scanner;

public class OddandEvenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int oddSum = 0;
        int evenSum = 0;
        do {
            System.out.println("Enter number");
            int x = sc.nextInt();
            if (x % 2 == 0) {
                evenSum += x;
            } else {
                oddSum += x;
            }
            System.out.println("Do you want to continue? press 1 for YES.");
            choice = sc.nextInt();
        } while (choice == 1);
        sc.close();
        System.out.println("Even sum = "+evenSum);System.out.println("Odd sum = "+oddSum);

    }
}
