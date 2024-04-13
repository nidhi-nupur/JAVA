import java.util.*;
public class ternaryoperator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String Type = ( (number&2) == 0) ? "Even" : "Odd";
        System.out.println(Type);
    }
}
