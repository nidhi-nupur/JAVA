public class halfPyramid {
    public static void inverted_rotated_half_pyramid(int n) { // n - lines
        // outer loop - i = no. of rows
        for(int i=1; i<=n; i++) {
            // inner loop - (no. of columns) to print stars and spaces
            // for spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
             
            // for stars
            for(int j=1; j<=i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        inverted_rotated_half_pyramid(4);
        inverted_rotated_half_pyramid(7);
        inverted_rotated_half_pyramid(20);
    }
}
