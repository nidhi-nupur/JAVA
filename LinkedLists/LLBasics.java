// LL is a linear type data Structure.
import java.util.*;
import java.util.LinkedList;
public class LLBasics {

    // Single NODE creation.
    public static class Node { 
        int data; // stores dataType of data. ( The actual value stored in the node.)
        int next; // Reference and Pointer to next node. (A reference to the next node in the list. For the last node, this reference is null.)
        int prev; //  A reference to the previous node in the list. For the first node, this reference is also null.

        public Node(int data) {
            this.data = data;
            this.next = null; 
        }
    }
    public static void main(String[] args) {
        
    }
}