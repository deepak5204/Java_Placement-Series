package Function;

import java.util.Scanner;

public class ConvertBinaryToDecimal {

    // convert octal to binary
    public static void octalToBinary(int num) {
        int decimalNum = octalToDecimal(num);
        decimalToBinary(decimalNum);
    }

    // convert octalToDecimal
    public static int octalToDecimal(int num){
        int r = 0; int s = 0; int pow = 0;
        while(num > 0){
            r = num % 10;
            s += r * (int)Math.pow(8, pow);
            pow++;
            num /= 8;
        }
        return s;
    }
    // convert binary to octal
    public static void binaryToOctal(int num){
        int decimalNum = binaryToDecimal(num);
        int pow = 0; int r = 0; int res = 0;
        while(decimalNum > 0){
            r = decimalNum % 8;
            res += r * (int)Math.pow(10, pow); 
            pow++;
            decimalNum /= 8; 
        }
        System.out.println(res);

    }

    // convert decimal to binary
    public static void decimalToBinary(int num){
        int temp = num;
        int r = 0; int s = 0; int pow = 0;
        while(temp > 0){
            r = temp % 2;
            s = s + r * (int)Math.pow(10, pow);
            pow++;
            temp /= 2;
        }
        System.out.println(s);
    }


    // convert binary to decimal
    public static int binaryToDecimal(int num){
        int temp = num;
        int r = 0; int s = 0; int pow = 0;
        while(temp > 0){
            r = temp % 10;
            s += r * (int)Math.pow(2, pow);
            pow++;
            temp /= 10;
        }
        return s;
        // System.out.println(s);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        // binaryToDecimal(BinaryNum);
        // decimalToBinary(num);
        // binaryToOctal(num);
        octalToBinary(num);
        }
}
