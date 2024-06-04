public class TwoDArrayAssignments {

    public static int numberOf7(int matrix[][]) {
        int count = 0;
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(matrix[i][j] == 7) {
                    count++;
                }
            }
        }
        return count;
    }


    public static int sumOfSecondRowElts(int nums[][]) {
        int sum = 0;
        for(int column=0; column<nums[0].length; column++) {
            sum = sum + nums[1][column];
        }
        return sum;
    }


    
    public static void printMatrix(int originalMatrix[][]) {
        for(int i=0; i<originalMatrix.length; i++) {
            for(int j=0; j<originalMatrix[0].length; j++) {
                System.out.print(originalMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void transposeMatrixA(int originalMatrix[][], int row, int column) {
        int Transpose[][] = new int[column][row];
        for(int i=0; i<row; i++) {
            for(int j=0; j<column; j++) {
                Transpose[j][i] = originalMatrix[i][j];
            }
        }
        // Print the transpose of original matrix.
        printMatrix(Transpose);
    }

    public static void main(String[] args) {

        // Print the number of 7’s that are inthe 2d array.
        // int matrix[][] = {{4, 7, 8}, {8, 8, 7}};
        // System.out.println("The total number of 7 in the array is: " + numberOf7(matrix));

        //  Print out the sum of the numbers inthe second row of the “nums” array.
        // int nums[][] = {{1, 4, 9}, {11, 4, 3}, {2, 2, 3}};
        // System.out.println("Sum of elements of second row is: " + sumOfSecondRowElts(nums));

        // Write a program to Find Transpose of a Matrix.
        int row = 2;
        int column = 3;
        int originalMatrix[][] = {{1, 4, 9}, {11, 4, 3}};
        System.out.println("The Original Matrix is: ");
        printMatrix(originalMatrix);
        System.out.println("The Transpose of the Matrix is: ");
        transposeMatrixA(originalMatrix, row, column);

    }
}
