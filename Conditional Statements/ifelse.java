public class ifelse {
    public static void main(String args[]) {
        //int age = 16;
        //int age = 18;
        int age = 35;
        if( age >= 18 ) {
            System.out.println("Age is legible for voting and driving.");
        }
        if( age > 13 && age <= 18 ) {
            System.out.println("Teenager");
        }
        else {
            System.out.println("Age is illegible for voting and driving.");
        }
    }
}
