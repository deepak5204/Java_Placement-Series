package Function;
import java.util.Scanner;

public class BinomialCofficient {
    
    //calculate factorial
    public static int calcFactorial(int n) {
        int fact = 1;
        while(n >= 1){
            fact *= n;
            n--;
        }
        return fact;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        sc.close();
        int fact_n = calcFactorial(n);
        int fact_r = calcFactorial(r);
        int fact_nmr = calcFactorial(n - r);

        int BinoCoff = fact_n / (fact_r * fact_nmr);

        System.out.println("Binomial cofficient : "+ BinoCoff);

    }
  
}
