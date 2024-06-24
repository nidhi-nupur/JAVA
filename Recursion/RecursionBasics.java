import java.util.Scanner;

public class RecursionBasics {

    public static void printDecreasingOrder(int number) {

        // Base Case
        if (number == 1) {
            System.out.println(number);
            return;
        }

        System.out.print(number + " ");
        printDecreasingOrder(number - 1); // Recursive case.
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        printDecreasingOrder(num);
    }
}