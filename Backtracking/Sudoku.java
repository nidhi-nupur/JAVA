public class Sudoku {

    // Method to check if placing a digit there will be safe or not
    public static boolean isSafe(int sudoku[][], int row, int column, int digit) {
        // for Row
        for (int i = 0; i <= 8; i++) {
            if (sudoku[i][column] == digit) {
                return false;
            }
        }

        // for Column
        for (int j = 0; j <= 8; j++) {
            if (sudoku[row][j] == digit) {
                return false;
            }
        }

        // For Calculating Grid
        int srtRowOfGrid = (row / 3) * 3;
        int srtColumnOfGrid = (column / 3) * 3;
        // Grid Size = 3 X 3
        for (int i = srtRowOfGrid; i < srtRowOfGrid + 3; i++) { // Travelling in Row of the Grid
            for (int j = srtColumnOfGrid; j < srtColumnOfGrid + 3; j++) { // Travelling in Column of the Grid
                if (sudoku[i][j] == digit) { // If Digit already present.
                    return false;
                }
            }
        }

        return true;
    }

    // Method to solve the Sudoku
    public static boolean sudokuSolver(int sudoku[][], int row, int column) {
        // Base Case
        if (row == 9 && column == 0) { // At last index of Sudoku i.e. at (9, 0).
            return true; // Got the final Solution
        }
        /* if (row == 9) { // This part is same as above condition.
            return true; // Got the final Solution
        } */

        // Recursive case
        int currentRow = row, currentColumn = column + 1; // initially, currentRow is the current row i.e. 1st row and currentColumn is the current Column.
        if (column + 1 == 9) { // When moving out of sudoku
            currentRow = row + 1; // Changing the Row
            currentColumn = 0; // Then the Column will be start from 0.
        }

        if (sudoku[row][column] != 0) { // When number already exist there, means NO ZERO.
            return sudokuSolver(sudoku, currentRow, currentColumn); // Move to the next Row and Column.
        }

        // Loop to place digits on the current Row and Column if it empty.
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoku, row, column, digit)) {
                sudoku[row][column] = digit;
                if (sudokuSolver(sudoku, currentRow, currentColumn)) { // Solution do exist.
                    return true;
                }
                sudoku[row][column] = 0; // If False.
            }
        }

        return false;
    }

    public static void printSolution(int sudoku[][]) {
        System.out.println("The final Solution for the Sudoku is: ");
        for (int i = 0; i <= 8; i++) {
            for (int j = 0; j <= 8; j++) {
                System.out.print(sudoku[i][j] + "  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        /* int sudoku[][] = {
                { 5, 3, 0, 0, 7, 0, 0, 0, 0 },
                { 6, 0, 0, 1, 9, 5, 0, 0, 0 },
                { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
                { 8, 0, 0, 0, 6, 0, 0, 0, 3 },
                { 4, 0, 0, 8, 0, 3, 0, 0, 1 },
                { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
                { 0, 6, 0, 0, 0, 0, 2, 8, 0 },
                { 0, 0, 0, 4, 1, 9, 0, 0, 5 },
                { 0, 0, 0, 0, 8, 0, 0, 7, 9 }
        };
 */
        int sudoku[][] = {
            {8, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 3, 6, 0, 0, 0, 0, 0},
            {0, 7, 0, 0, 9, 0, 2, 0, 0},
            {0, 5, 0, 0, 0, 7, 0, 0, 0},
            {0, 0, 0, 0, 4, 5, 7, 0, 0},
            {0, 0, 0, 1, 0, 0, 0, 3, 0},
            {0, 0, 1, 0, 0, 0, 0, 6, 8},
            {0, 0, 8, 5, 0, 0, 0, 1, 0},
            {0, 9, 0, 0, 0, 0, 4, 0, 0}
        };

        // initializing the row and column of the Sudoku from (0, 0)
        if (sudokuSolver(sudoku, 0, 0)) {
            System.out.println("Solution do exist.");
            printSolution(sudoku);
        } else {
            System.out.println("Solution does not exist.");
        }

    }

}
