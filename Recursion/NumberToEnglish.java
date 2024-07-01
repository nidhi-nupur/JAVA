import java.util.Scanner;

public class NumberToEnglish {

    // Array to store English words for digits (0 to 9). At index 0 = "zero", at index 1 = "one"...
    static String digitWords[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    public static String convertToEnglish(int num) {
        // Base case
        if (num == 0) {
            return ""; // reached the end (no more digits)
        }

        int lastDigit = num % 10; // Extract the last digit
        String lastDigitWord = digitWords[lastDigit]; // Get the English word for the last digit

        // Recursive call for the remaining part of the number
        String forRemainingPart = convertToEnglish(num / 10); // Recursive call (excluding the last digit).
        String finalResult = forRemainingPart + " " + lastDigitWord;
        return finalResult; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-zero positive integer: ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("Only positive integers should be entered.");
        } else {
            String englishRepresentation = convertToEnglish(num);
            System.out.println("English representation: " + englishRepresentation);
        }

        sc.close();
    }
}
