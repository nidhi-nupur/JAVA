// A constructor is like a special method that is called when we create a new object of a class.
public class Constructors {
    public static void main(String[] args) {
        // Student s1 = new Student("Nidhi Nupur"); // Creating new Student() object with the help of Student Constructors.
        // System.out.println(s1.name);
        
        Student s1 = new Student(); // Creating new Student() object with the help of Student Constructors.


    }
}



class Student {
    String name;
    int roll;

    // Student Constructor
    Student() {
    // Student(String name) {
    //     // Every class has a constructor, and if you don’t explicitly define one, Java provides a default constructor with **no arguments**. That is why we initialize the constructors while creating one.
    //     // The this() call can be used to invoke one constructor from another within the same class.
    //     this.name = name;

        System.out.println("The constructor is called..."); // When the Constructor is not initialized.
    }
}
