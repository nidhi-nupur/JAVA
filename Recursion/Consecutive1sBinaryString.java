public class Consecutive1sBinaryString {

    public static void printBinaryStringsWithNnConsecutive1s(int places, int previousLastPlace, String str) {
        // Base Case:
        if(places == 0) {
            System.out.println(str);
            return;
        }

        // Compare previous place with current place.
        printBinaryStringsWithNnConsecutive1s(places - 1, 0, str + "0");
        if(previousLastPlace == 0) {
            printBinaryStringsWithNnConsecutive1s(places - 1, 1, str + "1");
        }
    }
    public static void main(String[] args) {
        printBinaryStringsWithNnConsecutive1s(0, 0, "");
        printBinaryStringsWithNnConsecutive1s(1, 0, "");
        printBinaryStringsWithNnConsecutive1s(2, 0, "");
        printBinaryStringsWithNnConsecutive1s(3, 0, "");
        printBinaryStringsWithNnConsecutive1s(4, 0, "");
    }
}
