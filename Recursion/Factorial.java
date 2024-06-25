import java.util.Scanner;

public class Factorial {

    public static int calculateFactorial(int number) {
        // Base case
        if(number == 0) {
            return 1;
        }
        
        int factNminus1 = calculateFactorial(number - 1);
        int fact = number * factNminus1;
        return fact;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(calculateFactorial(num));
    }
}
