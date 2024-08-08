import java.util.Scanner;

public class Grid_SourceToDestination { 
/* 
    For Every Cell, 2 Choices to move( Right & Down ).

    -> Total times/number of Right turns == Number of Columns == m Column
    -> Total times/number of Down turns == Number of Rows == n Row

    -->  Total times/number of turns/movement == 2^(m + n).

    Hence TC = O(2^(m + n)).
 */
    public static int totalGridWays(int currRow, int currCol, int gridRowSize, int gridColSize) {
        // Base Case
        if(currRow == gridRowSize - 1 && currCol == gridColSize - 1) { // Condition for Last Cell. // When SourceCell == DestinationCell
            return 1; // One way
        } else if (currRow == gridRowSize || currCol == gridColSize) { // Boundary Cross Condition. // When SourceCell > DestinationCell
            return 0; // Zero way
        }

        int numberOfDownWays = totalGridWays(currRow + 1, currCol, gridRowSize, gridColSize); // Total number of way while moving Down
        int numberOfRightWays = totalGridWays(currRow, currCol + 1, gridRowSize, gridColSize); // Total number of way while moving Right
        return numberOfDownWays + numberOfRightWays; // (Total Number of Ways = DownWays + RightWays) // Recursive Call
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Row: ");
        int gridRowSize = sc.nextInt();
        System.out.println("Column: ");
        int gridColSize = sc.nextInt();
        System.out.println("The total number of ways to move from [SourceCell = (0, 0)] to [ " + gridRowSize + " X " + gridColSize + " ] is " + totalGridWays(0, 0, gridRowSize, gridColSize) + ", when only 'Down' and 'Right' moves are allowed." ); // SourceCell == (0, 0)
    }
}
