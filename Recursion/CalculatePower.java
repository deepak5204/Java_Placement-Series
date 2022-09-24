package Recursion;

public class CalculatePower {
    
    public static int calcPower(int n, int x){
        if(n == 1 || x == 0){
            return 1;
        }
        int smallValue = calcPower(n, x - 1);
        return smallValue * n;
    }
    public static void main(String[] args){
        int n = 2;
        int x = 5;
        int res = calcPower(n, x);
        System.out.println(n + " to the power " + x +" = " + res);
    }
}
