package ObjectOrientedProgramming.classandobjects;

import java.util.Scanner;

public class DynamicArray2Use {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
       
        // create object of DynamicArray2 class
        DynamicArray2 da = new DynamicArray2(n);
        for(int i = 0; i < q; i++){
            int queryType = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(queryType == 1){
                da.appendValue(x, y, n);
            } else {
                da.printValue(x, y, n);
            }
        }
        sc.close();
    }
}
