import java.util.*;
public class testprime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        boolean prime = false;
        for( int i=0; i<=n/2; i++) {
            if(n%i==0) {
                prime = true;
                break;
            }
        }
        if(prime == false) {
            System.out.println(n + " is Prime.");
        } else {
            System.out.println(n + " is Composite.");
        }
    }
}
