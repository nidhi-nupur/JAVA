import java.util.ArrayList;

public class MultiDimensionalArrayLists {
    public static void main(String[] args) {
        ArrayList<ArrayList<Float>> mainList = new ArrayList<>();
        ArrayList<Float> subList1 = new ArrayList<>();
        subList1.add(2.5f);
        subList1.add(5.6f);
        subList1.add(3.6f);
        mainList.add(subList1);

        ArrayList<Float> subList2 = new ArrayList<>();
        subList2.add(8.1f);
        subList2.add(9.9f);
        subList2.add(10.0f);
        mainList.add(subList2);

        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Float> currentList = mainList.get(i);
            for (int j = 0; j < currentList.size(); j++) {
                System.out.println(currentList.get(j) + " ");
            }
            System.out.println();
        }
        System.out.println(mainList);
    }
}
