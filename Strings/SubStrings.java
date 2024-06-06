public class SubStrings {

    public static String subStrings(String str, int startingIndex, int endingIndex) {
        String subStr = ""; // initializing str by empty.
        for(int i = startingIndex; i<endingIndex; i++) {
            subStr = subStr + str.charAt(i); // concatenating subStr(empty) with str(startingIndex to endingIndex).
        }
        return subStr;
    }
    public static void main(String[] args) {
        String string = "Nidhi Nupur";
        System.out.println(subStrings(string, 0, 7));
        System.out.println(subStrings(string, 0, 10));
        System.out.println(subStrings(string, 5, 3));
        System.out.println(subStrings(string, 4, 7));

        // inbuilt subString function: ***stringName.substring(startingIndex, endingIndex)***
        System.out.println(string.substring(3,5));
        System.out.println(string.substring(0,7));
        System.out.println(string.substring(7,80));
        System.out.println(string.substring(3,0)); // Syntax error. si shouldn't be greater than ei.
    }
}
