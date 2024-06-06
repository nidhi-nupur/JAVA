public class DSAcompareTo {
    public static void main(String[] args) {
        String names[] = {"Nidhiii", "Nupur", "Foreverrrr", "Learner"};
        String largest = names[0];
        for(int i=1; i<names.length; i++) { // TC = O(x*N) where x = largest string, N =  no of all str.
            if(largest.compareTo(names[i]) < 0) { 
                largest = names[i];
            }
        }
        System.out.println("The largest string is " + largest);
    }
}
