package LinkedList.$1_SinglyLinkedList;

public class SL_10_ReverseLinkedList {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,12,15,1,7,1,5,17,19,20,52,56,69,36,26,13};
        SinglyLinkedList ls=new SinglyLinkedList(arr);
        ls.displayList();

//        ls.reverseUsingAuxillaryArray();
//        ls.displayList();

        ls.reverseUsingTailingPointers();
        ls.displayList();
    }
}
