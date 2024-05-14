public class ArrayPairs {
    public static void PrintPairs(int numbers[]) {
        int tp = 0;
        for(int i = 0; i < numbers.length; i++) {
            int currentNum = numbers[i];
            for(int j = i+1; j < numbers.length; j++) {
                System.out.print("(" + currentNum + "," + numbers[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs: " + tp);
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        PrintPairs(numbers);
    }
}
