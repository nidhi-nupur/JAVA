public class binToDec {
    public static void binToDec(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;
        while(binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (int)(lastDigit * Math.pow(2, pow));
            pow++;
            binNum = binNum/10;
        }
        System.out.println("Decimal of " + myNum + " = " + decNum);
    }
    public static void main(String[] args) {
        binToDec(0);
        binToDec(01);
        binToDec(10);
        binToDec(11);
        binToDec(100);
        binToDec(101);
        binToDec(110);
        binToDec(111);
        binToDec(1000);
        binToDec(1010);
    }
}
