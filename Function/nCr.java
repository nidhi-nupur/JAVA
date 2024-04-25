public class nCr {
    public static int factorial(int n) {
        int fact = 1;
        for( int i=1; i<=n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static int BinoCoeff(int n, int r) {
        int n_fact;
        int r_fact;
        int nmr_fact;
        n_fact = factorial(n);
        r_fact = factorial(r);
        nmr_fact = factorial(n-r);
        int BinoCoff = n_fact / (r_fact * nmr_fact);
        return BinoCoff;
    }
    public static void main(String[] args) {
        int nCr;
        nCr = BinoCoeff(5,2);
        System.out.println("Binomial Coefficient is " + nCr);
        System.out.println("Binomial Coefficient is " + BinoCoeff(5, 2));
    }
}
