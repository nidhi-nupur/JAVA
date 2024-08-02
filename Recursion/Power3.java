public class Power3 { // TC = O(log n) // SC = O(log n)
    public static int power(int a, int n) {
        // Base Case
        if (n == 0) {
            return 1;
        }
        int halfPower = power(a, n / 2); // For EVEN power
        int halfPowerSquare = halfPower * halfPower;

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
