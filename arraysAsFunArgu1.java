public class arraysAsFunArgu1 {
    public static void update(int marks[], int nonChangable) {
        nonChangable = 5;
        for(int i=0; i<marks.length; i++) {
            marks[i] = marks[i] + 1;
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int marks[] = {97,98,99};
        int nonChangable = 10;
        update(marks,nonChangable);
        System.out.println(nonChangable);

        // print our marks
        for(int i=0; i<=marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}
