public class AbstractClassesConstructorsConcept {
    public static void main(String[] args) {
        Sphere s = new Sphere();

        // Shape --> Circle --> Sphere (inherits).
    }    
}

abstract class Shape {
    String dimension;

    // Constructor : By default it give their(Parent Class) value to Child Class's methods.
    Shape() {
        System.out.println("Shape Constructor called...");
    }

    void display() { // A Non-Abstract Method/Function.
        System.out.println("A non abstract method.");
    }

    abstract void area(); // Abstract method (no implimentation) // Shape just provide a idea to it**area()**.
    // It depends on Circle and Square Class, Not on Shape Class.

}




class Circle extends Shape {

    // Circle Constructor.
    Circle() {
        System.out.println("Circle Constructor is called...");
    }

    // Constructor Method.
    void dimensionVariableMethod() {
        dimension = "Just for Example, lets take 3-D.";
    }
    void area() {
        System.out.println("Area of the circle is PI*radius*radius.");
    }

}




class Sphere extends Circle {
    // Sphere Constructor.
    Sphere() {
        System.out.println("Sphere Constructor is called...");
    }
}