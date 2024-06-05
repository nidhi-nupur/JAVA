import java.util.Scanner;

public class StringsFunction {

    // Function to print al the characters of the string one by one by using .charAt(index position).
    public static void printAllCharacters(String str) {
        for(int i=0; i<str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Line = input.nextLine();

        //String Length
        System.out.println("The length or Size of the string is: " + Line.length()); 
        // .length() is a function that calculates the length or size of the Strings along with the spaces and next lines.


        // Concatenation = String1 + String2.
        String firstName = "Nidhi";
        String lastName = "Nupur";
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name:" + fullName);
        System.out.println(firstName + " " + lastName);


        // .charAt(indexPosition) = finds a particular character in a string.
        System.out.println("Character on 4th index is: " + fullName.charAt(4));
        printAllCharacters(fullName);
    }
}
