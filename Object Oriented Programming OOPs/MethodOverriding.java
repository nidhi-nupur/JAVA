public class MethodOverriding {
    public static void main(String[] args) {
        Maternal fam = new Maternal(); // object created for ***Parent Class***
        fam.mumma(); // Output: "Mumma is Naani's daughter" ***Parent Class***
        Maternal fami = new Paternal(); // object created for ***Child Class***
        fami.mumma(); // Output: "Papa is Naani's son-in-law." ***Child Class***
         
    }
}


class Maternal {
    void mumma() { // Function with no areguments without returntype.
        System.out.println("Mumma is Naani's daughter");
    }
}

class Paternal extends Maternal {
    void mumma() { // SAME Function with no areguments without returntype.
        System.out.println("Papa is Naani's son-in-law.");
    }
}