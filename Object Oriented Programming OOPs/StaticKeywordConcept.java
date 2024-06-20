public class StaticKeywordConcept {
    public static void main(String[] args) { // For public class, main function should be same for all classes, that is why it is **Static** in every code.
        Student s1 = new Student();
        s1.schoolName = "KVS"; // Setting schoolName for s1 student.
        System.out.println(s1.schoolName);

        Student s2 = new Student();
        System.out.println(s2.schoolName); // Output : KVS   cause school is declared statically for all object formed.

        // Student s3 = new Student();
        // s3.schoolName = "HLHS"; // Now the SchoolName is changed to HLHS for all the student object(s1, s2, s3).
        // System.out.println(s3.schoolName); // HLHS
    }
}

class Student {

    static int avgMarks(int math, int chem, int phy) { // Static function.
        return (math + chem + phy) / 3;
    }


    String name;
    int rollno;

    static String schoolName; // Constant for all Students.


    // Setters for name 
    void setName(String name) {
        this.name = name;
    }

    // Getters for name
    String getName() { // (Getters do not have arguments.)
        return this.name;
    }

    // Setters for rollno
    void setRollNo(int rollno) {
        this.rollno = rollno;
    }

    // Getters for rollno
    int getRollNo() {
        return this.rollno;
    }
} 