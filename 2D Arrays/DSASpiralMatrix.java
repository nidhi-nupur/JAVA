public class DSASpiralMatrix {
    public static void SpiralMatrix(int matrix[][]) {
        int startingRow = 0;
        int endingRow = matrix.length-1;
        int startingColumn = 0;
        int endingColumn = matrix[0].length-1;

        while(endingRow >= startingRow && endingColumn >= startingColumn) {
            // Print Top part of the matrix.
            for(int Column = startingColumn; Column <= endingColumn; Column++) {
                System.out.print(matrix[startingRow][Column] + " ");
            }

            // Print Right part of the matrix.
            for(int Row = startingRow+1; Row <= endingRow; Row++) {
                System.out.print(matrix[Row][endingColumn] + " ");
            }

            // Print Bottom part of the matrix.
            for(int Column = endingColumn-1; Column >= startingColumn; Column--) {
                if(startingRow == endingRow) {
                    break;
                }
                System.out.print(matrix[endingRow][Column] + " ");
            }

            // Print Left part of the matrix. 
            for(int Row = endingRow-1; Row >= startingRow+1; Row--) {
                if(startingColumn == endingColumn) {
                    break;
                }
                System.out.print(matrix[Row][startingRow] + " ");
            }

            startingColumn++;
            startingRow++;
            endingColumn--;
            endingRow--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int matrix [][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        SpiralMatrix(matrix);
    }
}
