// DSA Question: AMAZON
// String Compression 
// "aaabbcccdd" = "a3b2c3d2"
// "aaaaabbbbss" = "a5b4s2"
// "abc" = "abc"(in compressed form) not "a1b1c1"(coz in expand form).


public class DSAstringCompression {
    public static String Compression(String str) {
        String newString = "";
        for(int i=0; i<str.length(); i++) { // TC = O(n)
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            newString = newString + str.charAt(i);
            if(count > 1) {
                newString = newString + count.toString();
            }
        }
        return newString;
    }
    public static void main(String[] args) {
        String str = "aaabbbccddd";
        System.out.println(Compression(str));
    }
}
