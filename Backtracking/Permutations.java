public class Permutations {

    public static void findPermutations(String str, String answer) { // TC = O( n * n! )
        // Base case
        if (str.length() == 0) {
            System.out.println(answer);
            return;
        }
        // Recursive call
        for(int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            // "abcde" => "ab" + "de" = "abde"
            String newStr = str.substring(0, i) + str.substring(i + 1, str.length());
            findPermutations(newStr, answer + currentChar);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        findPermutations(str, " ");
    }
}
