public class checkScope {
    public static void main(String[] args) {
        // x is not accessible here because here calling is before declaration and prior calling will show error.
        // System.out.println(x); // error.
        int x = 10; // Method Scope.
        System.out.println(x); // Prints 10.
    }
    public static void myMethod() {
        // x is not accessible here because it is out of scope.
        // System.out.println(x); // error.
    }
}
