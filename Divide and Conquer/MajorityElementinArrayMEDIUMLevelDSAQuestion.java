public class MajorityElementinArrayMEDIUMLevelDSAQuestion {
    public static void main(String[] args) {
        int arr1[] = {3, 2, 3};
        int arr2[] = {2, 2, 1, 1, 1, 2, 2};

        System.out.println("Majority Elements in arr1 is " + majorityElement(arr1));
        System.out.println("Majority Elements in arr2 is " + majorityElement(arr2));
    }

    public static int majorityElement(int arr[]) {
        int majoElt = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > majoElt) {
                majoElt = arr[i];
            }
        }
        return majoElt;
    }
}
