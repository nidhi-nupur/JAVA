public class OptimiCheckPrime {
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
    public static void main(String[] args) {
        System.out.println(CheckPrime(2));
        System.out.println(CheckPrime(3));
        System.out.println(CheckPrime(5));
        System.out.println(CheckPrime(6));
        System.out.println(CheckPrime(1));
    }
}
