public class CompareStringFunction {
    public static void main(String[] args) {
        String str1 = "Nidhi is a good girl :)"; // 'str2' denotes the same string as 'str1'.
        String str2 = "Nidhi is a good girl :)";
        String str3 = new String("Nidhi is a good girl :)"); // but when 'new' string forms, it creates another separete string, even if the string contents are same still it'll never be equal to the previous exsisting strings.
    
        if(str1 == str2) {
            System.out.println("str1 and str2 are equal.");
        } else {
            System.out.println("str1 and str2 are not equal."); // are equal.
        }

        if(str2 == str3) {
            System.out.println("str2 and str3 are equal.");
        } else {
            System.out.println("str2 and str3 are not equal."); // not equal due to INTERNING concept.
        }


        // .equal() = a boolean type function which compares if the strings are exactly same or not.
        if(str1.equals(str3)) {
            System.out.println("str2 and str3 are equal."); // are equal.
        } else {
            System.out.println("str2 and str3 are not equal."); 
        }
    }

}
