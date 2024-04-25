// Function Overloading using number of parameters.
public class FuncOverloading { 
    // Method to calculate Sum of two integer numbers. 
    public static int Sum(int a,int b) {
        return a + b;
    }

    // Method to calculate Sum of three integer numbers. 
    public static int Sum(int a,int b,int c) {
        return a + b + c;
    }

    public static void main(String args[]) {
        System.out.println("The sum of two Integer numbers is " + Sum(5, 7));
        System.out.println("The sum of three Integer numbers is " + Sum(5, 7,6));
    }
}
