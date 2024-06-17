import java.lang.reflect.Constructor;

public class ConstructorsTypes {
    public static void main(String[] args) {
        // we create objects like this: // Parameters will match respectively.
        Student s1 = new Student(); // Calling Constructors with no arguments / parameters.
        System.out.println(s1);
        Student s2 = new Student("Nidhi Nupur"); // Calling Constructors with String arguments / parameters.
        System.out.println(s2.name);
        Student s3 = new Student(37); // Calling Constructors with int arguments / parameters.
        System.out.println(s3.roll);
        //Student s4 = new Student("Sakshi", 15); // error: arguments should match.

        // The above phenomenon(to call constructors repeatedly) is known as CONSTRUCTOR OVERLOADING.

        // CONSTRUCTOR OVERLOADING:- Constructor overloading in Java is when we have more than one constructor in a class, each having a different parameter list. This allows us to create objects in different ways.
    }   
}

class Student {
    String name;
    int roll;

    // Constructors with no arguments / parameters.
    Student() {
        System.out.println("");
    }

    // Constructors with arguments / parameters.
    Student(String name) {
        this.name = name;
    }
    Student(int roll) {
        this.roll = roll;
    }

    
}