import java.util.Scanner;

public class ContiCharPrintPatteren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of pyramid:"); 
        int lines = sc.nextInt();
        char ch = 'A';
        for(int line_no = 1; line_no <= lines; line_no++) {
            for(int chara = 1; chara <= line_no; chara++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

    }
}
