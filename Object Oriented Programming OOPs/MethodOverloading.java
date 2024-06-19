public class MethodOverloading {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(2, 3));
        System.out.println(calculator.sum((float)2.6, (float)3.7));
        System.out.println(calculator.sum(2, 3, 4));
        System.out.println(calculator.sum((float)2.6, (float)3.7, (float)4.3));
    }
}

class Calculator {
    int sum(int a, int b) {
        return a + b;
    } 

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    float sum(float a, float b, float c) {
        return a + b + c;
    }
}