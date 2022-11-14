package Function;

import java.util.Scanner;

public class SumOfDigit {


    public static void digitSum(int num){
        int res = 0;
        while(num > 0){
            res += num % 10;
            num /= 10;
        }
        System.out.println("sum of digit = "+ res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        digitSum(num);
    }
}
