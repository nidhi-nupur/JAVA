public class SBSubsets {

    public static void findSubsets(String str, StringBuilder answer, int i) {
        // Base Case
        if (i == str.length()) {
            if (answer.length() == 0) {
                System.out.println(" ");
            } else {
                System.out.println("{" + answer.toString() + "}");
            }
            return;
        }
        answer.append(str.charAt(i)); // Include the current character in the subset.
        findSubsets(str, answer, i + 1); // Backtrack to remove the last character added.

        answer.deleteCharAt(answer.length() - 1);

        findSubsets(str, answer, i + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str, new StringBuilder(), 0);
    }
}
