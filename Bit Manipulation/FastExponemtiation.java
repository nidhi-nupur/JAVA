import java.util.Scanner;

public class FastExponemtiation {
    
    
    // Tutorial's code.
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




    

    // For better understanding: Crystal Clear Code.
    public static int fastExponent(int base, int exponent) {
        int result = 1; // Initialize result.
        while(exponent > 0) {
            // If the current LSB is set("1"), multiply it with the result.
            // If the next bit is non-set("0"), skip multiplication.
            if ((exponent & 1) == 1) {
                result = result * base;
            }
            // Square the base
            base = base * base;
            // Right shift the exponent
            exponent = exponent >> 1;
        }
        return result; // Return the final result.
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Base: ");
        int base = sc.nextInt(); // Base Number.
        System.out.println("Exponent: ");
        int exponent = sc.nextInt(); // Exponent.
        System.out.println("Result of " + base + "^" + exponent + " is: " + fastExponent(base, exponent));
    }
}
