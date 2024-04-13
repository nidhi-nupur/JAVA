import java.util.*;
public class largestthreeno {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        if( (A >= B) && (A >= C) ) {
            System.out.println("First no. is greater among all.");
        }
        else if( B >= C) {
            System.out.println("Second no. is greater among all.");
        }
        else {
            System.out.println("Third no. is greater among all.");
        }
    }
} 