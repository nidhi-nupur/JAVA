public class DSADiagonalSum {
    public static void DiagonalDum(int matrix[][]) { 
        int sum = 0;

        // for(int i = 0; i < matrix.length; i++) { // TC = O(n^2)
        //     for(int j = 0; j < matrix[0].length; j++) {

        //         // Sum of Primary Diagonal.
        //         if(i == j) {
        //             sum += matrix[i][j];
        //         }

        //         // Sum of Secondary Diagonal.
        //         else if(i+j == matrix.length-1) {
        //             sum += matrix[i][j];
        //         }
        //     }
        // }


        // Optimized Method.
        for(int i = 0; i < matrix.length; i++) { // TC = O(n)
            // Sum of Primary Diagonal.
            sum += matrix[i][i];

            // Sum of Secondary Diagonal.
            if(i != matrix.length-1-i) {
                sum += matrix[i][matrix.length-1-i];
            }
        }
        System.out.println("Diagonal Sum: " + sum);
    }
    public static void main(String[] args) {
        int matrix [][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        DiagonalDum(matrix);
    }
}
