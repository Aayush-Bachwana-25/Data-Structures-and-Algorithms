package LinkedList.$1_SinglyLinkedList;

public class SL_9_RemovingDuplicatesInUnsortedLinkedList {
    public static void main(String[] args) {
        //int arr[]={1,2,3,4,4,5,6,5,4,5,7,8,4,6,2,9,36,2,45,2};
        int arr[]={1,2,2,3,2};
        SinglyLinkedList ls=new SinglyLinkedList(arr);
        ls.displayList();

        //Approach 1
        //Using Nested for loop
        ls.removeDuplicatesUnsortedUsingForLoop();
        ls.displayList();

        //Approach 2
        //Sort the link linked list and then use removeDuplicatesSorted();

        //Approach 3
        //Using Hash Table
        ls.removeDuplicatesUnsortedUsingHashTable();
        ls.displayList();
    }
}
