package Recursion;

public class CalculatePowerOf_h_log_n {
    public static int calcPower(int n, int x){
        if(x <= 0 ){
            return 1;
        }
        if(n <= 0){
            return 0;
        }
        if(x % 2 == 0){
            return calcPower(n, x/2) * calcPower(n, x/2); 
        } else {
            return calcPower(n, x/2) * calcPower(n, x/2) * n;
        }
    }
    public static void main(String[] args){
        int n = 2;
        int x = 5;
        int ans = calcPower(n, x);
        System.out.println(n +"rase to power" + x +" = "+ans);
    }
}
