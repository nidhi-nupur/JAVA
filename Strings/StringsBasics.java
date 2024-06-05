public class StringsBasics {
    // Strings: inbuilt Class
    public static void main(String[] args) {

        // Initialization and Declaration of a Strings.
        char array[] = {'N', 'i', 'd', 'h', 'i'};
        String str = "Nidhi";
        String stri = new String("Nupur");
        String strin = new String("!@#$%^&*()");
        System.out.println(array);
        System.out.println( str + " " + stri);
        System.out.println(strin);


        // Strings are ***IMMUTABLE(not changable)***: means we can't make any changes in Strings(existing). If it is required to make changes then we can do it by creating a *new* Strings.

    }
}