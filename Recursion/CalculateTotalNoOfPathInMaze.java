package Recursion;

public class CalculateTotalNoOfPathInMaze {

    public static int calculatePath(int i, int j, int n, int m){
        if(i == n || j == n){
            return 0;
        }
        if(i == n-1 && j == n-1){
            return 1;
        }

        // Calculate downward path
        int downPath = calculatePath(i + 1, j, n, m);
        
        // calculate rightward path
        int rightPath = calculatePath(i, j+1, n, m);

        //return total path
        return downPath + rightPath;
    }
    
    public static void main(String[] args){
        int n = 4; int m = 4;

        int totalPath = calculatePath(0, 0, n, m);
        System.out.println("total path : " + totalPath);
    }
}
