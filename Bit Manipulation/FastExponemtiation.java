import java.util.Scanner;

public class FastExponemtiation {
    public static int fastExponent(int number, int a) {
        int answer = 1;
        while (number > 0) {
            if((number & 1) != 0) { // Check LSB.
                answer = answer * a;
            }
            a = a * a;
            number = number >> 1;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        System.out.println("Enter the power of that number: ");
        int power = sc.nextInt();
        System.out.println("The number " + number + " raise to power " + power + " is " + fastExponent(power, number));
    }
}
