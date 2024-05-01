public class blockScope {
    public static void main(String[] args) {
        // compiler read the instruction of code line by line.
        // System.out.println(y); // error.
        int x = 10; // block scope.
        {
            int y = 20; // block scope.
            System.out.println(x); // 10
            System.out.println(y); // 20
        }
        // System.out.println(y); // error: y is not accessible here.
    }
}
