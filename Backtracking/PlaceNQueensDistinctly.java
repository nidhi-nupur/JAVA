import java.util.Scanner;

public class PlaceNQueensDistinctly {
// N^N ways...
    public static void nQueens(char chessBoard[][], int row) {
        // Base Case
        if (row == chessBoard.length) {
            printChessBoard(chessBoard);
            return;
        }

        // Column Loop {Recursive Call}
        // Placing N_Queens in N_Rows.
        for (int column = 0; column < chessBoard.length; column++) {
            chessBoard[row][column] = 'Q'; // For placing 1st Queen in 1st row and so on...
            nQueens(chessBoard, row + 1); // Function Call // For placing 2nd Queen in next row and so on...
            chessBoard[row][column] = '_'; // Backtracking step // to replace the 'Q' so that no Two Queens can be in
                                           // same row.
        }
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the chess Board: ");
        int boardSize = sc.nextInt();
        char chessBoard[][] = new char[boardSize][boardSize];

        // Initializing
        for (int row = 0; row < chessBoard.length; row++) {
            for (int column = 0; column < chessBoard.length; column++) {
                chessBoard[row][column] = '_'; // Initializing the boxes with a space( )
            }
        }

        nQueens(chessBoard, 0);
    }
}
