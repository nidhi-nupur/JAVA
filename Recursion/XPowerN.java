import java.util.Scanner;

public class XPowerN {

    public static int powerResult(int x, int n) {
        if(n == 1) {
            return x;
        }
        if(n == 0) {
            return 1;
        }
        return x * powerResult(x, n - 1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("x :");
        int x = input.nextInt();
        System.out.println("n :");
        int n = input.nextInt();
        System.out.println(powerResult(x, n));
    }
}
