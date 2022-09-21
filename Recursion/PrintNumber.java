package Recursion;

public class PrintNumber {

    // public static void printNum(int n){
    //     if(n == 6){
    //         return;
    //     }

    //     System.out.println(n);
    //     printNum( n + 1);
    // }
    
        public static void printNum(int n){
            if(n == 0){
                return ;
            }

            //It will print n-1 number
            printNum(n - 1);

            //we only print n
            System.out.println(n);
        }

    public static void main(String[] args){
        int n = 5;

        printNum(n);
    }
}
