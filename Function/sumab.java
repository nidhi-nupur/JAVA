import java.util.Scanner;

public class sumab {
    public static void Sum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("a :");
        int a = sc.nextInt();
        System.out.println("b :");
        int b = sc.nextInt();
        System.out.println("Sum = " + (a + b));
    }
    public static void main(String[] args) {
        Sum();
    }
}
