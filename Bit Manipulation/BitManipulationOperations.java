import java.util.Scanner;

public class BitManipulationOperations {

    // Get ith bits
    // number & (1 << i).
    // BitMask = (1 << i).
    public static int GetIthBit(int number, int i) {
        int bitMask = 1<<i;
        if((number & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }


    // Set ith bits
    // number | (1 << i).
    // BitMask = (1 << i).
    public static int SetIthBit(int number, int i) {
        int bitMask = 1<<i;
        return number | bitMask;
    }

    
    // Clear ith bits
    // number & ( ~ (1 << i) ).
    // BitMask = ( ~ (1 << i) ).
    public static int ClearIthBit(int number, int i) {
        int bitMask = ~(1<<i);
        return number & bitMask;
    }


    // Update ith bit
    public static int UpdateIthBit(int number, int i,int newBit) {
        // 1st approach.
        if(newBit == 0) {
            return ClearIthBit(number, i);
        } else {
            return SetIthBit(number, i);
        }

        // 2nd approach.
        // number = ClearIthBit(number, i); 
        // int bitMask = newBit << 1;
        // return number | bitMask;
    }


    // Clear Last i Bits. 
    // number & ((-1) << i).  OR  number & ((~0) << i).
    // BitMask = ((~0) << i).  OR  ((-1) << i).
    public static int ClearIBits(int number, int i) {
        int bitMask = (~0) << i;
        // int bitMask = (-1) << i;
        return number & bitMask;
    }


    // Clear the Range of Bits Between i and j (i, j = Bits indices).
    public static int ClearRangeOfBits(int number, int i, int j) {
        int a = ((~0) << (j + 1)); // a = ((-1) << (j + 1)); // One side part of Range Updates. 
        int b = (1 << i) - 1; // Other side part of Range Updates.
        int bitMask = a | b;
        return number & bitMask; // Range will be decided here.
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        System.out.println("Enter i: ");
        int i = sc.nextInt();
        System.out.println("Enter j: ");
        int j = sc.nextInt();

        // Get ith bits
        // System.out.println("The ith bit: " + GetIthBit(number, i));

        // Set ith bits
        // System.out.println("The ith bit is Set as: " + SetIthBit(number, i));

        // Clear ith bits
        // System.out.println("The ith Clear & new number is: " + ClearIthBit(number, i));

        // Update ith bit
        // System.out.println("Updating: " + i + "th bit of " + number + " and the result will be: " + UpdateIthBit(number, i, 1));
        // System.out.println("Updating: " + i + "th bit of " + number + " and the result will be: " + UpdateIthBit(number, i, 0));

        // Clear Last i Bits. 
        //System.out.println(ClearIBits(number, i));

        // Clear the Range of Bits Between i and j (i, j = Bits indices).
        System.out.println("After clearing the range of bits, the number is:" + ClearRangeOfBits(number, i, j));
    }


}
