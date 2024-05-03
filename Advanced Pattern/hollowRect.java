public class hollowRect {
    public static void hollowRectangle(int totRows, int totCols) {
        // outer loop - total no. of rows
        for(int i=1; i<=totRows; i++) {
            // inner loop - total no. of columns
            for(int j=1; j<=totCols; j++) {
                // cell - (i,j)
                if(i == 1 || i == totRows || j == 1 || j == totCols) {
                    // boundary cells 
                    System.out.print("%");
                } else { // hollow part
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollowRectangle(6,  9);
        hollowRectangle(10, 10);
        hollowRectangle(10, 25);
    }
}