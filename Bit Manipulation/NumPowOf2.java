import java.util.Scanner;

public class NumPowOf2 {
    public static boolean CheckNumberPowerOfTwoORNot(int number) {
        // if((number & (number - 1)) == 0) {
        //     return true;
        // } else {
        //     return false;
        // }

        return ((number & (number - 1)) == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check if it is power of 2 or not: ");
        int number = sc.nextInt();
        System.out.println(number + " is the Power Of 2: " + CheckNumberPowerOfTwoORNot(number));
    }
}
