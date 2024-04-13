public class typepromotion_4 {
    public static void main(String args[]) {
        int a=10;
        float b=20.25f;
        long c=25;
        double d=30;
        double ans=a+b+c+d; // double has max value.
        //int ans=a+b+c+d; // Error: Lossy conversion.
        System.out.println(ans);
    }
}
