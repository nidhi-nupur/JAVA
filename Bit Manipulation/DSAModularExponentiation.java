// Google 
// Calculate the modular exponentiation.

import java.util.Scanner;

public class DSAModularExponentiation {

    public static int power(int base, int exponent, int modulo) {
        int answer = 1; // Answer initialize with 1.
        base = base % modulo; // Update base if (base >= modulo).
        if(base == 0) {
            return 0; // If Base is divisible by modulo.
        }
        while(exponent > 0) {
            if((exponent & 1) != 0) { // If exponent is odd, multiply exponent with the answer
                answer = (answer * base) % modulo; // By doing so, exponent must be even now, so we can perform (exponent = exponent / 2).
            }
            exponent = exponent >> 1; // Right shift exponent by 1.
            base = (base * base) % modulo; // Change base to base^2.
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the BASE value: ");
        int base = sc.nextInt();
        System.out.println("Enter the Exponent value: ");
        int exponent = sc.nextInt();
        System.out.println("Enter the modulo value: ");
        int modulo = sc.nextInt();
        System.out.println("The power is: " + power(base, exponent, modulo));
    }
}
