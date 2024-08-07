import java.util.Scanner;

public class CountNoOfWaysQueensCanBePlaced {
    public static void nQueens (char chessBoard[][], int row) {
        // Base Case
        if (row == chessBoard.length) {
            count++;
        }

        // Recursive loops
        // using (N_Queens = N_Rows)Rule :- Every row should only one Q be placed.
        for (int col = 0; col < chessBoard.length; col++) { // Loop for Column, as the 1st row filled with one Queen then the next Queen should be in next row so we need to change the column to the next column.
            if (isSafe(chessBoard, row, col)) { // true(SAFE) or false(NOT SAFE)
                chessBoard[row][col] = 'Q';
                nQueens(chessBoard, row + 1); // Function calls
                chessBoard[row][col] = '_'; // Backtracking Steps
            }

        }
    }

    public static boolean isSafe(char Chessboard[][], int row, int col) {
        // Verticle up direction
        for (int checkRow = row - 1; checkRow >= 0; checkRow--) { // checkColumn is constant throughout the column
            if (Chessboard[checkRow][col] == 'Q') {
                return false; // Not suitable box to place Q 
            }
        }
        // diagonal left up
        for (int checkRow = row - 1, checkColumn = col - 1; checkRow >= 0 && checkColumn >= 0 /* if any of them false, won't satisfy the condition */ ; checkRow--, checkColumn--) {
            if (Chessboard[checkRow][checkColumn] == 'Q' ) {
                return false; // Not suitable box to place Q 
            }
        }
        // diagonal right up
        for (int checkRow = row - 1, checkColumn = col + 1; checkRow >= 0 && checkColumn < Chessboard.length; checkRow--, checkColumn++ ) {
            if (Chessboard[checkRow][checkColumn] == 'Q') {
                return false; // Not suitable box to place Q 
            }
        }
        return true;
    }

    public static void printChessBoard(char chessBoard[][]) {
        System.out.println(".......Queens arrangement.......");
        for (int row = 0; row < chessBoard.length; row++) {
            for (int column = 0; column < chessBoard.length; column++) {
                System.out.print(chessBoard[row][column] + " ");
            }
            System.out.println();
        }
    }

    static int count = 0; // Count value is shared across all instances of the class and retains its value throughout the execution of the program.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Chessboard: ");
        int sizeChessBoard = sc.nextInt();
        
        char chessBoard[][] = new char[sizeChessBoard][sizeChessBoard];

        if (sizeChessBoard == 2 || sizeChessBoard == 3) {
            System.out.println("NO any possible solutions!!");
        } else {
            // Initializing
            for (int row = 0; row < chessBoard.length; row++) {
                for (int col = 0; col < chessBoard.length; col++) {
                    chessBoard[row][col] = '_'; // Initializing the boxes with empty spaces.
                }
            }
        }

        
        nQueens(chessBoard, 0); 
        System.out.println("The total number of ways to place N Queens: " + count);
        sc.close();
    }
}
