import java.util.Scanner;

public class SumFirstNnaturalNumber {

    public static int sumFirstNnatNum(int number) {
        if(number == 0) {
            return 0;
        }
        /* if(number == 1) {
            return 1;
        } */
        int sumNminus1 = sumFirstNnatNum(number - 1);
        int sum = number + sumNminus1;
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(sumFirstNnatNum(num));
    }
}
 