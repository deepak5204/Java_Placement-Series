package Array;

import java.util.Scanner;

public class MaximizeTheSum {

    public static void maximizeSum(int[] arr1, int[] arr2) {

        int maxSum = 0;
        int s1 = 0;
        int s2 = 0;
        int i = 0;
        int j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                if (s1 > s2) {
                    maxSum += s1;
                } else {
                    maxSum += s2;
                }
                maxSum += arr1[i];
                i += 1;
                j += 1;
                s1 = s2 = 0;
            } else if (arr1[i] < arr2[j]) {
                s1 += arr1[i];
                i += 1;
            } else {
                s2 += arr2[j];
                j += 1;
            }
        }
        while (i < arr1.length) {
            s1 += arr1[i];
            i += 1;
        }
        while (j < arr2.length) {
            s2 += arr2[j];
            j += 1;
        }

        if (s1 > s2) {
            maxSum += s1;
        } else {
            maxSum += s2;
        }
        System.out.println("\n maxSum =" + maxSum);

    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter first array size");
        int[] arr1 = new int[s.nextInt()];
        System.out.println("Enter first array elements");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = s.nextInt();
        }

        System.out.println("Enter second array size");
        int[] arr2 = new int[s.nextInt()];
        System.out.println("Enter second array elements");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = s.nextInt();
        }
        s.close();

        maximizeSum(arr1, arr2);
    }

}
