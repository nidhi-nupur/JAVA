public class InterfacesConcepts {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();

        King k = new King();
        k.moves();

        Bishop b = new Bishop();
        b.moves();

        // ChessPlayers c = new ChessPlayers(); // Error :  You cannot create objects of an abstract (here as "interface" which is by default an abstract class) class using the 'new' keyword.
    }
}

// Interface Formation.
interface ChessPlayers {

    // This 'moves()' method is By-Default "public", "abstract" and "without implementation".
    void moves(); // BluePrints of method.
}

// Classes of ChessPlayers.

/* Class 1. Queen */
class Queen implements ChessPlayers {
    public void moves() { // implementation of moves() method. // Make it "public" as it is already defined as public in its interface.
        System.out.println("up, down, left, right, diagonal (in all four direction.)");
    }
}

/* Class 2. King */
class King implements ChessPlayers {
    public void moves() {
        System.out.println("up, down, left, right, diagonal (by 1 steps)");
    }
}

/* Class 3. Bishops */
class Bishop implements ChessPlayers {
    public void moves() {
        System.out.println("diagonal (in all four directions.)");
    }
}