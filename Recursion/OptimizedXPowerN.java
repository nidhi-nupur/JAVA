import java.util.Scanner;

public class OptimizedXPowerN {

    /* // Not the Optimized way.
    public static int powerResult(int x, int n) { // O(n) = still linear time complexity.
        if(n == 0) {
            return 1;
        }
        int evenNHalfPowerSq = powerResult(x, n/2) * powerResult(x, n/2); // Due to two times recursive call.
        // if n is odd
        if(n % 2 != 0) {
            evenNHalfPowerSq = x * evenNHalfPowerSq;
        }
        return evenNHalfPowerSq;
    } */


    // Optimized way.
    public static int powerResult(int x, int n) { // O(logn)
        if(n == 0) {
            return 1;
        }
        int halfPower = powerResult(x, n/2);
        int evenNHalfPowerSq = halfPower * halfPower; 
        if(n % 2 != 0) {
            evenNHalfPowerSq = x * evenNHalfPowerSq;
        }
        return evenNHalfPowerSq;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("x :");
        int x = sc.nextInt();
        System.out.println("n :");
        int n = sc.nextInt();
        System.out.println(powerResult(x, n));
    }
}
