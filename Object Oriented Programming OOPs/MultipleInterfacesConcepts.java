public class MultipleInterfacesConcepts {
    public static void main(String[] args) {
        Bear b = new Bear();
        b.eats();
        b.walksOn();
    }
}

// Multiple Interfaces Formation.

/* First Interface */
interface Herbivore {

    // This 'eats()' method is By-Default "public", "abstract" and "without implementation".
    void eats(); // 
}

/* Second Interface */
interface Carnivore {

    // This 'eats()' method is By-Default "public", "abstract" and "without implementation".
    void walksOn(); // 
}


// Class of Carnivore and Herbivore.
/* Class "Bear" */
class Bear implements Herbivore, Carnivore {
    public void eats() { // Herbivore method.
        System.out.println("Bears eates both grass and animals.");
    }

    public void walksOn() { // Carnivore method.
        System.out.println("Bears walks on 2 legs as well as 4 legs.");
    }
}