public class ContiguousSubstrings {
    // contiguous substrings == starting and ending with the same character.

    public static int countContiguousSubstrings(String str) {
        int count = 0; // to keep track of the total count of valid substrings.
        int n = str.length();
        // Iterate through each character
        for (int i = 0; i < n; i++) {
            char currentChar = str.charAt(i);
            // Check if the current character is the same as the previous character
            int j = i;
            while (j < n && str.charAt(j) == currentChar) {
                count++; // Valid substring found
                j++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // String inputString = "abacaba";
        String inputString = "     ";
        int result = countContiguousSubstrings(inputString);
        System.out.println("Count of contiguous substrings: " + result);
    }
}
