public class StringSubsets {

    // Method to find all subsets of a given string.
    public static void findSubsets(String str, String answer, int i) {
        // Base Case
        if (i == str.length()) {
            if (answer.length() == 0) { // If the answer string is empty.
                System.out.println(" ");
            } else {
                System.out.println("{" + answer + "}");
            }

            return;
        }

        // Recursive Case
        findSubsets(str, answer + str.charAt(i), i + 1); // Include the current character in the subset
        findSubsets(str, answer, i + 1); // Exclude the current character from the subset
    }

    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str, " ", 0); // Initially the set is empty.
    }
}
