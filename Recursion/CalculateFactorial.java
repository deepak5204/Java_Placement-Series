package Recursion;



public class CalculateFactorial {
    public static int calcFact(int n){
        if(n == 1 || n == 0){
            return 1;
        }
    
        int smallValue = calcFact(n - 1);
        return n * smallValue;
    }
    public static void main(String[] args){
        int n = 5;

        int res = calcFact(n);
        System.out.println("factorial of "+ n+ " = " + res);

    }
}
