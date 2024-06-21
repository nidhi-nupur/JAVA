// Practice Question 5
public class Inheritance {
    public static void main(String[] args) {
        Vehicle obj1 = new Car(); // Function Overriding / Polymorphism.
        obj1.print(); // Derived class(Car)

        Vehicle obj2 = new Vehicle();
        obj2.print(); // Base class(Vehicle)
    }
}


class Vehicle {
    void print() {
        System.out.println("Base class(Vehicle)");
    }
}

class Car extends Vehicle {
    void print() {
        System.out.println("Derived class(Car)");
    }
}