import java.util.Scanner;

public class RemoveDuplicateLetters {

    public static void ignoreDuplicateLetter(String enteredStr, int strIndex, StringBuilder newStr, boolean trackAlphabets[]) {
        // Base Case
        if(strIndex == enteredStr.length()) {
            System.out.println(newStr);
            return;
        }

        // For Comparision of characters.
        char currentChar = enteredStr.charAt(strIndex);
        if(trackAlphabets[currentChar - 'a'] == true) {
            // means Character is Duplicate.
            ignoreDuplicateLetter(enteredStr, strIndex + 1, newStr, trackAlphabets);
        } else {
            trackAlphabets[currentChar - 'a'] = true;
            ignoreDuplicateLetter(enteredStr, strIndex + 1, newStr.append(currentChar), trackAlphabets);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String enteredStr = sc.nextLine();
        //StringBuilder sb = new StringBuilder("");
        //boolean trackAlphabets[] = new boolean[26];
        System.out.println(ignoreDuplicateLetter(enteredStr, 0, new StringBuilder("") /* sb */, new boolean[26] /* trackAlphabets */));
    }
}
