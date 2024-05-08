import java.util.Scanner;

public class arrayIO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a;
        // a = sc.nextInt();
        int marks[] = new int[100];
        System.out.println("Enter the subject marks : ");
        marks[0] = sc.nextInt(); // input
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        System.out.println("Physics : " + marks[0]);  // output
        System.out.println("Chemistry : " + marks[1]);
        System.out.println("Maths : " + marks[2]);

        marks[2] = 98; // update
        marks[2] = marks[2] + 3; // update
        System.out.println("Maths : " + marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2])/3;
        System.out.println("Percentage : " + percentage + "%");
    }
}
