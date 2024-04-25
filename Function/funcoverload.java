// Function Overloading using Datatypes of parameters.
public class funcoverload {
    // Method to calculate Sum of two numbers if int datatype.
    public static int Sum(int a,int b) {
        return a + b;
    }

    // Method to calculate Sum of two float numbers. 
    public static float Sum(float a,float b) {
        return a + b;
    }

    public static void main(String args[]) {
        System.out.println("The sum of two Integer numbers is " + Sum(5, 7));
        System.out.println("The sum of two float numbers is " + Sum(5.86f, 7.357f));
    }
}
