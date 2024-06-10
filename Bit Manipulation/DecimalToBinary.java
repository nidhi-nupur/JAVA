import java.util.Scanner;

public class DecimalToBinary {

    public static String BinaryFormFromDecimal(int decimal) {
        String binary = ""; // This will store the binary representation.

        while (decimal > 0) {
            int remainder = decimal % 2; // Get the remainder
            binary = remainder + binary; // Prepend(add before) it to the binary string.
            decimal = decimal / 2; // Update 'decimal' by dividing it by 2.
        }

        return binary;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number: ");
        int decimal = sc.nextInt(); // Input the decimal number.
        System.out.println("Binary representation: " + BinaryFormFromDecimal(decimal));
    }
}
