package Pattern;

public class RectangularNumbers {

    public static void print(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[1].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int n = 3;
        int[][] mat = new int[n*2-1][n*2-1];

        int start = 0, end = n*2-1;
        int count = n;
        while(count > 0){
            for(int i = start; i < end; i++){
                for(int j = start; j < end; j++){
                    mat[i][j] = count;
                }
            }
            start++;
            end--;
            count--;
        }

        print(mat);
    }
}
