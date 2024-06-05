public class DSApalindrome {

    public static boolean isPalindrome(String str) {
        // TC = O(n) Linear time complexity.
        for(int i=0; i<str.length()/2; i++) { // iterate till half of the string length.
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)) { // Comparfe: 1st and last, 2nd and 2ndlast...
                return false; // if not Palindrome.
            }
        }
        return true; // if Palindrome.
    }
    public static void main(String[] args) {
        String string = "kayak";
        String str = "civic";
        String st = "hannah";
        String s = "rotator";
        String stri = "was it a cat i saw";

        System.out.println("kayak is Palindrome? " + isPalindrome(string));
        System.out.println("civic is Palindrome? " + isPalindrome(str));
        System.out.println("hannah is Palindrome? " + isPalindrome(st));
        System.out.println("rotator is Palindrome? " + isPalindrome(s));
        System.out.println("'was it a cat i saw' is Palindrome? " + isPalindrome(stri));

    }
}
