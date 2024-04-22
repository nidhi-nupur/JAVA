import java.util.Scanner;

public class halfnospyramid { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of pyramid(number of lines) : ");
        int line = sc.nextInt();
        // int line =10;
        System.out.println("The half pyramid : ");
        for(int line_no = 1; line_no <= line; line_no++) {
            for( int numbers = 1; numbers <= line_no; numbers++) {
                System.out.print(numbers);
            }
            System.out.println();
        }
    }
}