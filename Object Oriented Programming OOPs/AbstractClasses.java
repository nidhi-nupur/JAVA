public class AbstractClasses {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.display();
        c.area();
        
        Square sqr = new Square();
        sqr.display();
        sqr.area();


        //Shape s = new Shape(); // Error :  You cannot create objects of an abstract class using the 'new' keyword.

        // Constructor Concept.
        System.out.println(sqr.dimension); // Output : 2-D
        System.out.println(c.dimension); // Output : 2-D
    }
}

// An Abstract Class 
abstract class Shape {
    String dimension;

    // Constructor : By default it give their(Parent Class) value to Child Class's methods.
    Shape() {
        dimension = "2-D";
    }

    void display() { // A Non-Abstract Method/Function.
        System.out.println("A non abstract method.");
    }

    abstract void area(); // Abstract method (no implimentation) // Shape just provide a idea to it**area()**.
    // It depends on Circle and Square Class, Not on Shape Class.

}

// class Circle extends Shape {
//     double rad;
//     Circle(double rad) {
//         this.rad = rad;
//     }

//     @Override
//     double area() {
//         double result = Math.PI * rad *rad;
//         System.out.println("The are of the circle is : " + result);
//         return result;
//     }
// }

class Circle extends Shape { // MUST use ***area()*** as method. Otherwise error.

    // Constructor Method.
    void dimensionVariableMethod() {
        dimension = "Just for Example, lets take 3-D.";
    }
    void area() {
        System.out.println("Area of the circle is PI*radius*radius.");
    }

}

class Square extends Shape { // MUST use ***area()*** as method. Otherwise error.
    // Constructor Method.
    void dimensionVariableMethod() {
        dimension = "Just for Example, lets take 8-D.";
    }
    void area() {
        System.out.println("Area of the square is side*side.");
    }
}