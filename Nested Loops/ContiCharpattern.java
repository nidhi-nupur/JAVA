import java.util.Scanner;

public class ContiCharpattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the line of pyamid :");
        int lines = sc.nextInt();
        System.out.println("The character pyramid is : ");
        for(int line_no = 1; line_no <= lines; line_no++) {
            for(char ch = 1; ch <= line_no; ch++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
