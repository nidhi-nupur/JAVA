public class halfPyramidWithNum {
    public static void inverted_half_pyramid_withNumbers(int n) {
        for(int i=1; i<=n; i++) {
            // inner loop - for Numbers
            for(int j=1; j<=n-i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        inverted_half_pyramid_withNumbers(5);
        inverted_half_pyramid_withNumbers(9);
        inverted_half_pyramid_withNumbers(20);
    }
}
