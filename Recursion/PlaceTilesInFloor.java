package Recursion;

public class PlaceTilesInFloor {

    public static int tilesPlacement(int n, int m){
        // if size of tiles equal to size of floor then here only two ways of placement
        if(n == m){
            return 2;
        }
        if(n < m){
            return 1;
        }

        //vertical placement of tile in the floor
        int vertPlacement = tilesPlacement(n-m, m);

           //Horizontal placement of tile in the floor
           int horizPlacement = tilesPlacement(n-1, m);

        //    total ways of tiles placement in the floor
        return vertPlacement + horizPlacement;
    }
    public static void main(String[] args){

        int n = 4; 
        int m = 2;
        int totalWays = tilesPlacement(n, m);
        System.out.println("total ways of tiles placement in the floor is : " + totalWays);
    }
}
