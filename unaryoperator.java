public class unaryoperator {
    public static void main(String args[]) {
        int a = 10;
        int b = a++;
        int c = ++a;
        int b1 = a--;
        int c1 = --a;
        System.out.println("a = " + (a));
        System.out.println("b = " + (b));
        System.out.println("c = " + (c));
        System.out.println("b1 = " + (b1));
        System.out.println("c1 = " + (c1));
    }
}
