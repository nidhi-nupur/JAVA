import java.util.Scanner;

public class BinaryToDecimal {

    public static int DecimalFormFromBinary(String binaryFromString) {
        int decimal = 0; // This will store the decimal representation.

        // Converting String to char array to iterate over each character.
        char binaryArray[] = binaryFromString.toCharArray();

        // Iteration over each binary digit.
        for(int i = binaryArray.length - 1; i >= 0; i--) {

            // Converting char to integer value ('0' -> 0, '1' -> 1).
            int binaryDigit = binaryArray[i] == '1' ? 1 : 0;

            
            int TwoPower = (int)Math.pow(2, (binaryArray.length - 1 - i));

            // Calculating the decimal value of the current binary digit
            decimal = decimal + (binaryDigit * TwoPower);
        }
        return decimal;
    }
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.println("Enter the Binary form: "); 
        String binaryFormString = sb.nextLine(); // Input binary number as a string.
        System.out.println("Decimal representation of " + binaryFormString + " is " + DecimalFormFromBinary(binaryFormString) );
    }
}
