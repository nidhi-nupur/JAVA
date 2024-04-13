import java.util.*;
public class typecast_1 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        // float a= 36.999999999999f;
        float a= 36.99999f;
        int b=(int) a; // Narrowing/Explicit Conversion.
        System.out.println(b);
    }
}
