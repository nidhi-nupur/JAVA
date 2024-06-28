public class FriendsPairingProblem {

    public static int waysOfPairinf(int num) {
        // Base Case
        if(num == 0 || num == 1 || num == 2) {
            return num;
        }

        /* // finding pairing ways.
        // if single:
        int singleWays = waysOfPairinf(num - 1);
        // if one paired:
        int paired = waysOfPairinf(num - 2);
        int pairedWays = (num - 1) * paired;
        // Total ways for pairing
        int totalWays = singleWays + pairedWays;
        return totalWays; */

        // Combine lines of code:
        return waysOfPairinf(num - 1) + (num - 1) * waysOfPairinf(num - 2);
    }
    public static void main(String[] args) {
        System.out.println(waysOfPairinf(1));
        System.out.println(waysOfPairinf(2));
        System.out.println(waysOfPairinf(3));
        System.out.println(waysOfPairinf(4));
        System.out.println(waysOfPairinf(0));
    }
}
