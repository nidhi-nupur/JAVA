import java.util.*;
public class reversenumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        while(n > 0) {
            int last_no = n % 10;
            System.out.print(last_no + " ");
            n = n / 10;
        }
        // System.out.println();
    }
}
