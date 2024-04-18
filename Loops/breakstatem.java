public class breakstatem {
    public static void main(String args[]) {
        for(int i = 1; i<=15; i++) {
            if(i==7) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("Out of the loop..");
    }
}
