import java.util.Scanner;
public class AltParamSumab {
    public static int Sum(int a,int b) { //parameters or formal parameters
        //Function Definition
        // int sum = a + b;
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a :");
        int a = sc.nextInt();
        System.out.println("b :");
        int b = sc.nextInt();
        int Sum = Sum(a,b); //arguments or actual parameters.
        System.out.println("Sum = " + (a + b));
    }
}
