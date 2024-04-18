import java.util.*;
public class primenum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        if(n == 2) {
            System.out.println(n + " is Prime.");
        } else {
            boolean prime = true; // Assumed that taken no. is already prime.
            for(int i=2; i<=n-1; i++) {
                if(n % i == 0) { //n isn't equal to i which is not equal to 1 or itself.
                     prime = false;
                }
            }
            if(prime == true) {
                System.out.println(n + " is Prime.");
            } else {
                System.out.println(n + " is Composite.");
            }
        }
    }
}
