public class StringLengthRecursion {

    public static int findLength(String str) {
        // Base case: empty string
        if (str.isEmpty()) { /* boolean java.lang.String.isEmpty()
                                Returns true if, and only if, length() is 0.
                                Specified by: isEmpty() in CharSequence
                                Returns:
                                true if length() is 0, otherwise false */
            return 0; // If the string is empty, return 0.
        }

        // Recur for the remaining substring (excluding the first character)
        return 1 + findLength(str.substring(1));
    }

    public static void main(String[] args) {
        // String inputString = "Nidhi Nupur";
        String inputString = "                    ";
        int length = findLength(inputString);
        System.out.println("Length of the string: " + length);
    }
}
