import java.util.Scanner;

public class Fibonacci {

    public static int sumFibonacciSeries(int number) {
        if(number == 0 || number == 1) {
            return number;
        }
        int fibNminus1 = sumFibonacciSeries(number - 1);
        int fibNminus2 = sumFibonacciSeries(number - 2);
        int fibN = fibNminus1 + fibNminus2;
        return fibN; 
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(sumFibonacciSeries(num));
    }
}
