package LinkedList.$1_SinglyLinkedList;

public class SL_12_MergingOfTwoSortedLinkedLists {
    public static void main(String[] args) {
        int arr1[]={4,5,7,29,33,36};
        int arr2[]={15,17,19,34,36,48,53};

        SinglyLinkedList ls1=new SinglyLinkedList(arr1);
        SinglyLinkedList ls2=new SinglyLinkedList(arr2);
        SinglyLinkedList lsResult=new SinglyLinkedList();

        lsResult = ls1.mergeSorted(ls2);
        lsResult.displayList();
    }
}
