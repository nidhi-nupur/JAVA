import java.util.Scanner;
public class ParamSumab {
    public static void Sum(int a,int b) {
        //Function Definition
        System.out.println("Sum = " + (a + b));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a :");
        int a = sc.nextInt();
        System.out.println("b :");
        int b = sc.nextInt();
        Sum(a,b);
    }
}
