package LinkedList.$3_DoublyLinkedList;

public class DL_1_CreateAndDisplay {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};

        DoublyLinkedList dl=new DoublyLinkedList(arr);

        dl.displayList();
        dl.reverseDisplayList();
    }
}
