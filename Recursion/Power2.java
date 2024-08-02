public class Power2 { // TC = O(n) NOT O(2^n) or O(log n) // SC = O(n)
    public static int power(int a, int n) {
        // Base Case
        if (n == 0) {
            return 1;
        }
        int halfPowerSquare = power(a, n / 2) * power(a, n / 2); // For EVEN power

        if (n % 2 != 0) {
            return a * halfPowerSquare; // For ODD power
        }

        return halfPowerSquare;
    }

    public static void main(String[] args) {
        System.out.println("Solve: " + power(2, 6)); // EVEN power
        System.out.println("Solve: " + power(2, 9)); // ODD power
    }
}
