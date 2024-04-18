import java.util.Scanner;
public class evenoddsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int choice;
        int evenSum = 0;
        int oddSum = 0;
        do {
            System.out.print("Enter the number ");
            n = sc.nextInt();
            if( n % 2 == 0) {
                evenSum = evenSum + n;
            } else {
                oddSum = oddSum + n;
            }
            System.out.print("To continue, Press '1' for 'yes' or '0' for 'no'");
            choice = sc.nextInt();
        } while(choice==0);
            System.out.println("Sum of even numbers: " + evenSum);
            System.out.println("Sum of odd numbers: " + oddSum);
        }
         
}
