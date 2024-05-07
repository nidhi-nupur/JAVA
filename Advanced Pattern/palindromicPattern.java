public class palindromicPattern {
    public static void PalindromicPattern(int n) {
        for(int i=1; i<=n; i++) {
            // Spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            // descending numbers
            for(int j=i; j>=1; j--) {
                System.out.print(j);
            }
            // Ascending numbers
            for(int j=2; j<=i; j++) {
                System.out.print(j);                
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        PalindromicPattern(6);
        PalindromicPattern(9);
    }
}
