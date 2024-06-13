import java.util.Scanner;

public class BitManipulation_Assignments {
    
    // // Question 1. What is the value of x^x for any valueof x?
    // // By using Built-in method = Math.pow(a, b)
    // public static float numberPowerNumber(int number) {
    //     return (float)Math.pow(number, number); // Math.pow() method to calculate x^x.
    // }
    // // Without using Built-in method.
    // public static int PowerNumber(int number) {
    //     if(number == 0) {
    //         return 1;
    //     }
    //     int answer =1; // Initializing answer to 1.
    //     for(int i = 1; i <= number; i++) { //to multiply number by itself number times
    //         answer = answer * number; 
    //     }
    //     return answer;
    // }




    // // Question 2. Swap two numbers without using any third variable.
    // public static void SwappingTwoNumbers(int a, int b) {
    //     a = a + b;
    //     b = a - b;
    //     a = a - b;
    //     System.out.println("After swapping: a = " + a + ", b = " + b);
    // }




    // Question 3.  Add 1 to an integer using Bit Manipulation.
    // // Using Bitwise XOR method. 
    // // This method works by flipping all the trailing 1s to 0s and the first 0 to 1, which is the same as adding 1 to the binary number
    // public static int AddOneUsingBitManipulation(int num) {
    //     int m = 1; // Initialize m to 1, (1)_10 == (0001)_2 // which is used to iterate through the bits of num.
    //     while((num & m) != 0) { // Iterate until there is no carry.
    //         num = num ^ m; // Flip the bits where m and num both have 1s.
    //         m = m << 1; // Left shift m by 1 to check the next bit.
    //     }
    //     // Using XOR to add 'm' to 'num' where 'm' is now the first 0 from the right
    //     num = num ^ m;
    //     return num; // Return the result which is ('num' + 1)
    // }

    // Using Bitwise NOT method.
    // This method works by flipping all the bits of n and then adding 1 to it using the same logic as the previous example. The initial NOT operation is equivalent to taking the two’s complement, which is the same as negating the number. Adding 1 to this negated number effectively adds 1 to the original number.
    public static int AddOneUsingBitwiseNOT(int n) {
        n = ~n; // Applying bitwise NOT to the number, which flips all the bits.
        int m = 1; // Initialize m to 1, (1)_10 == (0001)_2 // which is used to iterate through the bits of n.
        while((n & m) != 0) { // Iterating until there is no carry
            // Use XOR to flip the bits where 'm' and 'n' both have 1s
            n = n ^ m;
            // Shift 'm' left by 1 to check the next bit
            m = m << 1;
        }
        // Use XOR to add 'm' to 'n' where 'm' is now the first 0 from the right
        n = n ^ m;
        // Return the result which is 'n' + 1
        return n;
    }




    // Question 4. Convert uppercase characters to lowercase using bits.
    public static char toLowerCase(char ch) {
        // 
        if(ch >= 'A' && ch <= 'Z') { // Checking if the character is uppercase
            ch = (char)(ch | 32); // Converting to lowercase by OR-ing with 32.
        }
        return ch; // Return the lowercase character
    }

    

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        // // Question 1. What is the value of x^x for any valueof x?
        // // By using Built-in method = Math.pow(a, b)
        // System.out.println("Enter the number: ");
        // int number = sc.nextInt();
        // System.out.println("The value of " + number + "^" + number + " is:" + numberPowerNumber(number));
        // // Without using Built-in method.
        // System.out.println("The value of " + number + "^" + number + " is:" + PowerNumber(number));




        // // Question 2. Swap two numbers without using any third variable.
        // System.out.print("Enter a: ");
        // int a = sc.nextInt();
        // System.out.print("Enter b: ");
        // int b = sc.nextInt();
        // SwappingTwoNumbers(a, b);




        // // Question 3. Add 1 to an integer using Bit Manipulation.
        // // // Using Bitwise XOR method.
        // // System.out.println("Enter the number: ");
        // // int number = sc.nextInt();
        // // System.out.println("Number after adding 1: " + AddOneUsingBitManipulation(number));
        // // Using Bitwise XOR method.
        // System.out.println("Enter the number: ");
        // int number = sc.nextInt();
        // System.out.println("Number after adding 1: " + AddOneUsingBitwiseNOT(number));
    



        // Question 4. Convert uppercase characters to lowercase using bits.
        char upperCaseCharacter = sc.next().charAt(0);
        System.out.println("Lowercase of " + upperCaseCharacter + " is: " + toLowerCase(upperCaseCharacter));
    }
}
