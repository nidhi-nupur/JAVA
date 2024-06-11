import java.util.Scanner;

public class OddorEven {

    public static void checkEvenOdd(int number) {
        if((number & 1) == 0) { // Using Bitwise AND Operator. // 1 = Bitmask.
            // Odd-> LSB = 1. 
            // Even-> LSB = 0.
            // LSB = ((number & 1) == 0) == even number.
            // LSB = ((number & 1) != 0) == odd number.
            System.out.println(number + " is even.");;
        } else {
            System.out.println(number + " is odd.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        checkEvenOdd(number);
    }


    // public static void checkEvenOdd(int number) {
    //     int bitMask = 1;
    //     if((number & bitMask) == 0) { // Using Bitwise AND Operator.
    //         // Even-> LSB = 0.
    //         // LSB = ((number & bitMask) == 0) == even number.
    //         System.out.println(number + " is even.");;
    //     } else {
    //         // Odd-> LSB = 1.
    //         // LSB = ((number & bitMask) != 0) == odd number.
    //         System.out.println(number + " is odd.");
    //     }
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the number: ");
    //     int number = sc.nextInt();
    //     checkEvenOdd(number);
    // }
}