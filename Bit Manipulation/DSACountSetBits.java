// Google / Amazon

// Count Set Bits("1") in a number. 

import java.util.Scanner;

public class DSACountSetBits {
    public static int CountSetBits(int number) {
        int count = 0;
        while(number > 0) {
            if((number & 1) != 0) {
                count++;
            }
            number = number >> 1;
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the number of Set Bits in it: ");
        int number = sc.nextInt();
        System.out.println("The total number of set bits are: " + CountSetBits(number));

    }
}
