import java.util.Scanner;

public class SearchArrayElement {
    public static boolean SearchElement(int matrix[][], int key){
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(matrix[i][j] == key) {
                    System.out.println("Element found at : " + "(" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Element doesn't found");
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length; // matrix[0] = 1st row = 0th index row
        System.out.println("Enter the elements of matrix : ");
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }

        SearchElement(matrix, 8);
    }
}
