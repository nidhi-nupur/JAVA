public class factorial {
    public static int factorial(int n) {
        int fact = 1;
        for( int i=1; i<=n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        int Fact;
        Fact = factorial(5);
        System.out.println("Factorial is " + Fact);
        System.out.println("Factorial is " + factorial(8));
    }
}
