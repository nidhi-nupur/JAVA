import java.util.*;
public class quesbreak {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("Enter the number : ");
            int number = sc.nextInt();
            if( number % 10 == 0 ) {
                break;
            }
            System.out.println(number);
        } while(true);
    }
}
