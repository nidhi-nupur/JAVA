import java.util.LinkedList;

public class LLBasicCreation {
    public static void main(String[] args) {
        // LL_Object_Creation :
        // [int, float, char, boolean]X wrong way
        // [Integer, Float, Character] right way
        LinkedList<Integer> ll = new LinkedList<>();

        // Add_LL_Nodes : object.addLast(node_Elt), object.addFirst(node_Elt)
        ll.addLast(2);
        ll.addLast(5);
        ll.addFirst(1);
        ll.addFirst(0);
        // 0->1->2->5
        System.out.println(ll);

        // Remove_LL_Nodes : object.removeLast(), object.removeFirst(),
        // object.removeAll(Collection_ object)
        ll.removeLast();
        System.out.println(ll);
        ll.removeFirst();
        System.out.println(ll);
        ll.removeAll(ll);
        System.out.println(ll);
    }
}
