package LinkedList.$1_SinglyLinkedList;

public class SL_11_ConcatenationOfTwoLinkedLists {
    public static void main(String[] args) {
        int arr1[]={4,5,7,54,33,29,36};
        int arr2[]={15,17,19,34,36,23};

        SinglyLinkedList ls1=new SinglyLinkedList(arr1);
        SinglyLinkedList ls2=new SinglyLinkedList(arr2);
        SinglyLinkedList lsResult=new SinglyLinkedList();

        lsResult=ls1.concatenate(ls2);
        lsResult.displayList();
    }
}
