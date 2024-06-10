public class StringB { 
    // **StringBuilder** is a class that represents a mutable sequence of characters.
    // Unlike the ***String class***, which creates immutable sequences, ***StringBuilder*** allows for the creation of a modifiable sequence of characters.
    // This is particularly useful when we need to make a lot of modifications to a string of text because, unlike strings, changes to a *StringBuilder* do not require creating a new object each time, which can save memory and processing time.
    

    // Mutable: Can change the contents of a StringBuilder after it’s created.

    // Performance: It’s faster than using String when modifications are frequent because it doesn’t create a new object for each modification.

    public static void main(String[] args) {
        // Type of StringBuilder 'sb' is not actually String but we can convert it into string, by doing:
        // sb != String.
        // sb.toString() == String.

        // int a = 10;
        // System.out.println(a.toString()); // Not possible.

        // Integer a = 10; //  By using Integer "class".
        // System.out.println(a.toString()); // Output = 10.
        
        // char ch = 'a';
        // System.out.println(ch.toString()); // Not possible.

        // Character ch = 'a'; // By using Character "class".
        // System.out.println(ch.toString()); // Output = a.



        // StringBuilder sb = new StringBuilder("");
        
        // for(char c = 'a'; c <='z'; c++) { // TC = O(26) , 26times program runs.
        //     sb.append(c); //Appending String.
        //     String string = sb.toString();
        // }
        // System.out.println(sb); // Output: abcdefghijklmnopqrstuvwxyz.
        // System.out.println(sb.length());


        StringBuilder sb = new StringBuilder();
        sb.append("Nidhi");
        sb.append(" ");
        sb.append("Nupur!");

        String result = sb.toString(); // Converts the StringBuilder to a String
        System.out.println(result); // Outputs: Nidhi Nupur!
        System.out.println(result.length());
    }
}
