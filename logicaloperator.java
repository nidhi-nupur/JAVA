public class logicaloperator {
    public static void main(String args[]) {
        // System.out.println( (7<5) && (6<2) ); // Both false.
        // System.out.println( (7<5) && (6<9) ); // One false.
        // System.out.println( (7<3) && (6<9) ); // One false.
        // System.out.println( (7<9) && (6<7) ); // Both true.

        
        // System.out.println( (7<5) || (6<2) ); // Both false.
        // System.out.println( (7<5) || (6<9) ); // One false.
        // System.out.println( (7<3) || (6<9) ); // One false.
        // System.out.println( (7<9) || (6<7) ); // Both true.


        System.out.println( (5>2) );
        System.out.println( !(5>2) );

        System.out.println( (5>8) );
        System.out.println( !(5>8) );
    }
}
