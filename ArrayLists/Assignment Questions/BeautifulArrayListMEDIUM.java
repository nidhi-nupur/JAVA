// TC = O(nlogn)
// SC = O(n)

import java.util.ArrayList;
import java.util.List;

public class BeautifulArrayListMEDIUM {
    // This method takes an integer n as an argument and returns a list of integers.
    public static List<Integer> beautifulArrayList(int n) {
        return constructBeautifulArray(1, n);
    }

    public static List<Integer> constructBeautifulArray(int start, int end) {
        List<Integer> result = new ArrayList<>();
        if (start > end) {
            return result;
        }
        if (start == end) {
            result.add(start);
            return result;
        }
        
        // Add all odd elements in the first half
        result.addAll(constructBeautifulArray(start, (end + start) / 2));
        // Add all even elements in the second half
        result.addAll(constructBeautifulArray((end + start) / 2 + 1, end));
        
        return result;
    }

    public static void main(String[] args) {
        /* int n = 6; */
        /* int n = 5; */
        int n = 76;
        List<Integer> beautifulArray = beautifulArrayList(n);
        System.out.println(beautifulArray);
    }
}
