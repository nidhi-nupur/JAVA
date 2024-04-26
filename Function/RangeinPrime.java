public class RangeinPrime {
    public static boolean CheckPrime(int n) {
        if(n == 2) {
            return true;
        }
        for(int i=2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void PrimeNosInRange(int n) {
        for(int i=2;  i <= n; i++) {
            if(CheckPrime(i)) { // true
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        PrimeNosInRange(5);
        PrimeNosInRange(75);
        PrimeNosInRange(25);
        PrimeNosInRange(51);
    }
}
