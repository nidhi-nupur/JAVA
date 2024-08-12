import java.util.ArrayList;

public class TwoDArrayLists {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        for (int i = 1; i <= 5; i++ ) {
            list1.add(i*1); // Multiple of 1/ Table of 1
            list2.add(i*2); // Multiple of 2/ Table of 2
            list3.add(i*3); // Multiple of 3/ Table of 3
        }
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        System.out.println(mainList);

        // Nested Loop to print the ArrayList(mainList)
        for (int i = 0; i <= mainList.size() - 1; i++) {
            ArrayList<Integer> currentList = mainList.get(i);
            for (int j = 0; j <= currentList.size() - 1; j++ ) {
                System.out.print(currentList.get(j) + " ");
            }
            System.out.println();
        }
        System.out.println(mainList);
        list2.remove(2);
        list2.remove(3);
        System.out.println(mainList);
    }
}
