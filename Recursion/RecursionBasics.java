import java.util.Scanner;

public class RecursionBasics {


    // Print the number in Decreasing Order from n to 1.
    public static void printDecreasingOrder(int number) {

        // Base Case
        if (number == 1) {
            System.out.println(number);
            return;
        }

        System.out.print(number + " ");
        printDecreasingOrder(number - 1); // Recursive case.
    }


    // Print the number in Increasing Order from 1 to n.
    public static void printIncreasingOrder(int number) {
        // Base case
        if(number == 1) {
            System.out.print(number);
            return;
        }
        printIncreasingOrder(number - 1); // Recursive case.
        System.out.print( " " + number);
    }

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        printDecreasingOrder(num);
        printIncreasingOrder(num); 
    }
    
}
