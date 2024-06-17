public class CopyConstructors {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Nidhi Nupur";
        s1.roll = 37;
        s1.password = "ASDF";
        s1.marks[0] = 100;
        s1.marks[1] = 98;
        s1.marks[2] = 80;

        Student s2 = new Student(s1); // Copied
        s1.password = "LKJH";
        s1.marks[2] = 90; // Update after copied, still be updated in results, Because it was just its refernece that has copied not the whole s1. (Not Deep Copied: means all data COPIED and can't changed after updatation.)
        // Print s2 marks.
        for(int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];
    
    // Copy Constructor.
    Student(Student s1) {
        marks = new int[2];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
    }

    Student() {
        marks = new int[2];
        System.out.println(" ");
    }

    Student(String name) {
        marks = new int[2];
        this.name = name;
    }
    Student(int roll) {
        marks = new int[2];
        this.roll = roll;
    }
}