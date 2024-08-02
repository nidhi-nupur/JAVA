public class Power1 { // TC = O(n) // SC = O(n)
    public static int power(int a, int n) {
        // Base Case
        if (n == 0) {
            return 1;
        }

        return a * power(a, n - 1);
    }
    public static void main(String[] args) {
        System.out.println("Solve: " + power(2, 6)); // For EVEN power
        System.out.println("Solve: " + power(2, 9)); // For ODD power
    }
}
