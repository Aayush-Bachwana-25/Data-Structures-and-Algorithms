package LinkedList.$1_SinglyLinkedList;

public class SL_5_Improved_LinearSearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        SinglyLinkedList s=new SinglyLinkedList(arr);
        s.displayList();

        s.ImprovedLinearSearchElement(5);
        s.displayList();

        s.ImprovedLinearSearchElement(6);
        s.displayList();

        s.ImprovedLinearSearchElement(7);
        s.displayList();
    }
}
