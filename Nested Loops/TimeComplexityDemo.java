public class TimeComplexityDemo {
    public static void main(String[] args) {
        int n = 10; // Example value for n
        int k = 3; // Example value for k (k < n)

        /* Time Complexity for this code is O(n/k) */

        // Outer loop
        for (int i = 0; i < n; i = (i + k)) {
            System.out.println("Outer loop iteration with i = " + i);

            // Inner loop
            for (int j = (i + 1); j <= k; j++) {
                System.out.println("         Inner loop iteration with j = " + j);
            }
        }
    }
}
