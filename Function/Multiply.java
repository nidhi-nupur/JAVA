public class Multiply {
    public static int multi(int a, int b) {
        int product = a*b;
        return product;
    }
    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        int prod = multi(a,b);
        System.out.println("Product = " + prod);
        prod = multi(35,75);
        System.out.println("Product = " + prod);
    }
}
