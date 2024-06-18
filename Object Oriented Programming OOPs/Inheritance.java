public class Inheritance {
    public static void main(String[] args) {

        // (a.) Single Level Inheritance.
        // Paternal papa = new Paternal();
        // papa.love();
        // papa.respect();
        // papa.inLaws();


        // (b.) Multi Level Inheritance.
        Mama zed = new Mama();
        zed.love();
        zed.respect();
        zed.name = "Zed";
        System.out.println(zed.name);



    }
}

// Parent/Base class
class Maternal {
    String familyName;

    void love() {
        System.out.println("They love each other unconditionally.");
    }

    void respect() {
        System.out.println("They respect each other so well.");
    }
}

class Mumma extends Maternal{
    int preety;
}

class Mama extends Mumma {
    String name;
}

// // Child/Derived/Sub class
// class Paternal extends Maternal {
//     String fatherFamily;

//     void inLaws() {
//         System.out.println("Mumma's In-Laws..");
//     }
// }


// 4 types of Inheritance:

// (a.) Single Level Inheritance.
//         Base Class -----> Derived Class.

// (b.) Multi Level Inheritance.
//         Base Class -----> Derived Class -----> Derived Class.

// (c.) Hierarchial Inheritance.
//                           -- Base Class --
//     Derived Class 1 <-----                -----> Derived Class 2
//                           |    |    |
//                           |    |    |
//                           V    |    V
//             Derived Class 3    |    Derived Class n (Multiple Derived Classes)
//                                V
//                         Derived Class 4

// (d.) Hybrid Inheritance.

// (e.) Multiple Inheritance. (in C++)
//                     Interfaces(same as Classes) A        Interfaces(same as Classes) B
//                         \            /
//                           \         /
//                             \      /
//                              V    V
//                              Interfaces(same as Classes) C




