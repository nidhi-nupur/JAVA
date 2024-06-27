public class TileProblem {

    public static int tilingWays(int n) { // 2 x n (floor size) // n = length of the floor/board.
        // Base Case
        if(n == 0 || n == 1) {
            return 1;
        }
        // Case 1:
        // Vertical Arrangement
        int verticleTiles = tilingWays(n - 1); // Function recalling with (n - 1)
        // Case 2.
        // Horizontal Arrangement
        int horizontalTiles = tilingWays(n - 2); // Function recalling with (n - 2)
        // Total ways to arrange the tiles.
        int totalWays = verticleTiles + horizontalTiles;
        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println( "Total number of ways" + tilingWays(0));
        System.out.println( "Total number of ways" + tilingWays(1));
        System.out.println( "Total number of ways" + tilingWays(2));
        System.out.println( "Total number of ways" + tilingWays(3));
        System.out.println( "Total number of ways" + tilingWays(4));
        System.out.println( "Total number of ways" + tilingWays(5));
        
    }
}
