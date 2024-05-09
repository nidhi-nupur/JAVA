import java.util.*;
public class DSlargestNumFinder1 {
    public static int getLargestNumber(int numbers[]) {
        int largest = Integer.MIN_VALUE; // - infinity
        for(int i=0; i<numbers.length; i++) {
            if(largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {1, 2, 7, 3, 5, 6};
        System.out.println("The largest value is : " + getLargestNumber(numbers));
    }
}
