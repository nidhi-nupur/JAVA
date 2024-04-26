public class CheckisPrime {
    public static boolean CheckPrime(int n) {
        if(n == 2) {
            return true;
        }
        boolean Check_Prime = true;
        for(int i = 2; i <= n-1; i++) {
            if(n % i == 0) {
                Check_Prime = false;
                break;
            }
        }
        return Check_Prime;
    }
    public static void main(String[] args) {
        System.out.println(CheckPrime(5));
        System.out.println(CheckPrime(2));
        System.out.println(CheckPrime(1));
        System.out.println(CheckPrime(6));
    }
}