import java.util.Scanner;

public class StringsInputOutput {
    public static void main(String[] args) {
        // Strings Input & Output.
        Scanner input = new Scanner(System.in);
        String Input;
        // Input = input.next(); // .next***Function of Scanner Class*** = it stores the input Strings into memory/Structure/Variable. It doesn't count the *space or next line(ln)* between two words. It'll just print the word before space or next line(ln). 


        // .nextLine(): To print the whole line or paragraph.
        Input = input.nextLine();

        
        System.out.println("Output: " + Input);

        

    }
}
