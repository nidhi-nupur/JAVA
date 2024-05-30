import java.util.Scanner;

public class SearchLargestElement {
    public static int LargestNumberSearch(int matrix[][]) {
        int max = matrix[0][0]; // Assuming 1st elements is the largest.
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(matrix[i][j] > max) {
                    max = matrix[i][j]; // Finding the largest number in 2D array.
                }
            }
        }
        System.out.println("The largest number in 2D array is : " + max);
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[2][3];
        System.out.println("Enter the elements of matrix : ");
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }

        LargestNumberSearch(matrix);
    }
}
