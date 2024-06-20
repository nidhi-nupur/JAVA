// public class skc {
//     public static void main(String[] args) {
//         Mumma m = new Mumma();
//         System.out.println(m.name);
//     }
// }

// class Naani {

//     String name;
//     Naani() {
//         System.out.println("Naani Constructor is called...");
//     }
// }

// class Mumma extends Naani {
//     Mumma() {

//         super.name = "Alex";
//         // super(); // When we do not call this Super keyword then java by default create h Super keyword for the code.
//         System.out.println("Mumma Constructors is called...");
//     }
// }


public class SuperKeywordConcept {
    public static void main(String[] args) {
        Mumma m = new Mumma();
        System.out.println(m.name);
    }
}

class Naani {
    String name; // Added the 'name' field

    Naani() {
        System.out.println("Naani Constructor is called...");
    }
}

class Mumma extends Naani {
    Mumma() {
        super.name = "Alex"; // Set the name inherited from Naani
        System.out.println("Mumma Constructor is called...");
    }
}
