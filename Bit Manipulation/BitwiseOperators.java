public class BitwiseOperators {
    public static void main(String[] args) {
        System.out.println("5 & 6 = " + (5 & 6)); // Bitwise AND(&).
        System.out.println();
        System.out.println("5 | 6 = " + (5 | 6)); // Bitwise OR(|).
        System.out.println();
        System.out.println("5 ^ 6 = " + (5 ^ 6)); // Bitwise XOR(^).
        System.out.println();
        System.out.println("~0 = " + (~0)); // Bitwise NOT(^).
        System.out.println("~1 = " + (~1)); // Bitwise NOT(^).
        System.out.println("~(-6) = " + (~(-6))); // Bitwise NOT(^).
        System.out.println("~(-5) = " + (~(-5))); // Bitwise NOT(^).
        System.out.println("~9 = " + (~9)); // Bitwise NOT(^).
        System.out.println();
        System.out.println("5 << 2 = " + (5 << 2)); // Binary Left Shift(<<).
        System.out.println("1 << 5 = " + (1 << 5)); // Binary Left Shift(<<).
        System.out.println();
        System.out.println("6 >> 1 = " + (6 >> 1)); // Binary Right Shift(>>).
        System.out.println("6 >> 2 = " + (6 >> 2)); // Binary Right Shift(>>).
    }
}