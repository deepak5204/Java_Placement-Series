package Pattern;

public class Matrix {

    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[1].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void changeRowColumn(int[][] mat, int M, int N, int x, int y) {
        // change row
        for (int j = 0; j < N; j++) {
            mat[x][j] = 0;
        }

        // change column
        for (int i = 0; i < M; i++) {
            mat[i][y] = 0;
        }
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 0, 1 },
                { 1, 1, 1 },
                { 1, 1, 1 }
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[1].length; j++) {
                if (arr[i][j] == 0) {
                    changeRowColumn(arr, arr.length, arr[1].length, i, j);
                    print(arr);
                    return;
                }
            }
        }
    }
}
