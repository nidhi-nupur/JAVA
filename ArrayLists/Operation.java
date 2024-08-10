import java.util.ArrayList;

public class Operation {
    public static void main(String[] args) {
        ArrayList<Integer> forAddOperation = new ArrayList<>();
        ArrayList<Integer> forGetOperation = new ArrayList<>();
        ArrayList<Integer> forSetOperation = new ArrayList<>();
        ArrayList<Integer> forRemoveOperation = new ArrayList<>();

        // ADD ELEMENTS Operation
        //__________ Syntax 1 :- objectName.add(arrayElement); // TC = O(1). In the worst case, when the array needs to be resized, it becomes O(n).
        forAddOperation.add(1); // TC = O(1) for EACH and EVERYTIME of the Operations("add") use.
        forAddOperation.add(2); 
        forAddOperation.add(3); 
        forAddOperation.add(4); 
        forAddOperation.add(5); // TC = O(1) // Dynamically resize the Array.
        forAddOperation.add(6); 
        System.out.println(forAddOperation);
        //___________ Syntax 2 :- objectName.add(index, arrayElement); // TC = O(n), because elements may need to be shifted.
        forAddOperation.add(0, 7); 
        forAddOperation.add(1, 4); 
        forAddOperation.add(2, 0); 
        forAddOperation.add(3, 1); 
        forAddOperation.add(4, 9); 
        forAddOperation.add(5, 5); 
        System.out.println(forAddOperation); // Output :- [7, 4, 0, 1, 9, 5, 1, 2, 3, 4, 5, 6], Previous elements get Shifted to the further indexes.
        System.out.println(forAddOperation); // Output :- [7, 4, 0, 1, 9, 5, 1, 2, 3, 4, 5, 6], Previous elements get Shifted to the further indexes.


        // GET ELEMENTS Operation
        // Syntax:- objectName.get(IndexOfTheElement); // TC = O(1), as it directly accesses the element.
        forGetOperation.add(6);
        forGetOperation.add(3);
        forGetOperation.add(1);
        forGetOperation.add(0);
        forGetOperation.add(4);
        forGetOperation.add(2);
        System.out.println(forGetOperation);
        int elt1 = forGetOperation.get(5); 
        int elt2 = forGetOperation.get(4); 
        int elt3 = forGetOperation.get(3); 
        int elt4 = forGetOperation.get(2); 
        int elt5 = forGetOperation.get(1); 
        int elt6 = forGetOperation.get(0);
        System.out.println("Indexes are: " + elt1 + " " + elt2 + " " + elt3 + " " + elt4 + " " + elt5 + " " + elt6);
        System.out.println(forGetOperation);


        // SET ELEMENTS Operation
        // Syntax :- objectName.set(index, arrayElement); // TC = O(1), as it directly accesses the element.
        forSetOperation.add(9);
        forSetOperation.add(8);
        forSetOperation.add(7);
        forSetOperation.add(6);
        forSetOperation.add(5);
        forSetOperation.add(4);
        System.out.println(forSetOperation);
        forSetOperation.set(0, 12);
        forSetOperation.set(1, 15);
        forSetOperation.set(2, 83);
        forSetOperation.set(3, 54);
        forSetOperation.set(4, 89);
        forSetOperation.set(5, 13);
        System.out.println(forSetOperation);


        // REMOVE ELEMENTS Operation -  remove an element at a specific index.
        // Syntax :- objectName.remove(index); // Time Complexity: O(n) (due to shifting elements)
        forRemoveOperation.add(5);
        forRemoveOperation.add(6);
        forRemoveOperation.add(7);
        forRemoveOperation.add(8);
        forRemoveOperation.add(9);
        forRemoveOperation.add(0);
        System.out.println(forRemoveOperation);
        forRemoveOperation.remove(3);
        System.out.println(forRemoveOperation);
        forRemoveOperation.remove("2");
        System.out.println(forRemoveOperation);


        // CONTAINS ELEMENTS Operation - check the elements is present or not in the array.
        // Syntax :- objectName.contains(element);
        System.out.println(forRemoveOperation.contains(7)); // true
        System.out.println(forRemoveOperation.contains(98)); // false
    }
}
