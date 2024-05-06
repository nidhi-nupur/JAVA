public class zeroOneTriangle {
    public static void zero_one_triangle(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                if( (i+j) % 2 == 0) {
                    // (i+j) == even
                    System.out.print("1" + " ");
                } else { 
                    // (i+j) == odd
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        zero_one_triangle(9);
        zero_one_triangle(15);
    }
}
