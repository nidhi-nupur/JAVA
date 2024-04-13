import java.util.*;
public class estimateques {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float bill = (pencil + pen + eraser);
        System.out.println(bill);
    }
}
