public class decToBin {
    public static void DecToBin(int decNum) {
        int pow = 0;
        int myNum = decNum;
        int binNum = 0;
        while(decNum > 0) {
            int rem = decNum % 2;
            binNum = binNum + (rem * (int)Math.pow(10, pow));
            pow++;
            decNum = decNum/2;
        }
        System.out.println("Binary form of " + myNum + " = " + binNum);
    }
    public static void main(String[] args) {
        DecToBin(0);
        DecToBin(1);
        DecToBin(2);
        DecToBin(3);
        DecToBin(4);
        DecToBin(5);
        DecToBin(6);
        DecToBin(7);
        DecToBin(8);
        DecToBin(9);
        DecToBin(100);
    }
}
