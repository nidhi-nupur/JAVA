import java.util.Scanner;

public class StringsAssignmentsQuestions {

    private static int countLowercaseVowels(String str) {
        int count = 0;
        String vowels = "aeiou";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (vowels.indexOf(ch) >= 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String enteredString = sc.nextLine();

        int vowelCount = countLowercaseVowels(enteredString);
        System.out.println("Number of lowercase vowels: " + vowelCount);

        // String str = "ShradhaDidi";
        // String str1 = "ApnaCollege";
        // String str2 = "ShradhaDidi";
        // System.out.println(str.equals(str1) + " " + str.equals(str2));

        String str = "ApnaCollege".replace("l", ""); // replaces the letter "l" bu " ".
        System.out.println(str);
    }
}
