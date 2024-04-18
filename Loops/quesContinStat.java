import java.util.*;
public class quesContinStat {
    public static void main(String args[]) {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number:");
            int n = sc.nextInt();
            if( n%10 == 0) {
                continue;
            }
            System.out.println(n);
        } while(true);
    }
}
