import java.util.Scanner;

public class Power4 {
    public static void calculate(int n) {
        int i, j, k = 0;
        for (i = n / 2; i <= n; i++) {
            for (j = 2; j <= n; j = j * 2) {
                k = k + n / 2;
            }
        }
        System.out.println("The value of k is: " + k);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        calculate(n);
        scanner.close();
    }
}
