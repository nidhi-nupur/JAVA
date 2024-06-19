import java.util.Scanner; // Java inbuilt package.

public class PackageInBuilt {
    public static void main(String[] args) {
        // In Java, the Scanner class is commonly used to read input from the user or from files.

        Scanner sc = new Scanner(System.in); // Scanner (class) 
        // sc (object) for Scanner (class)
        // System.in (arguments / parameters) for Scanner class.
        int a = 37;
        System.out.println(a);
        int b = sc.nextInt();

        // sc : This refers to an instance of the Scanner class.

        // nextInt() : This method is called on the Scanner object (sc).
        // It reads the next integer value from the input stream (usually from the keyboard) and returns that value. If the input is not an integer, it will throw an exception.

        // int b : This declares a variable named b of type int.
        // The value obtained from nextInt() is assigned to this variable.

        // So, in summary, the statement reads an integer input from the user and stores it in the variable b.

        System.out.println(b);
    }
}
