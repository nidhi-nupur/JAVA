import java.util.Scanner;

public class SearchSmallestElement {
    public static int SmallestNumberSearch(int matrix[][]) {
        int min = matrix[0][0]; // Assuming 1st elements as the smallest.
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }
        System.out.println("The Smallest number in 2D array is : " + min);
        return 0;
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the elements of the matrix : ");
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        System.out.println("The matrix is : ");
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }
        SmallestNumberSearch(matrix);
    }
}
