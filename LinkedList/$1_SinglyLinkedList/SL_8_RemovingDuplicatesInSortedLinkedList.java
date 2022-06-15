package LinkedList.$1_SinglyLinkedList;

import java.util.Scanner;

public class SL_8_RemovingDuplicatesInSortedLinkedList {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,2,3,3,4,4,5,5,6,6,6,6,7,7,8,8,8,9,9,9,9};

        SinglyLinkedList ls=new SinglyLinkedList(arr);
        ls.displayList();

        ls.removeDuplicatesSorted();
        ls.displayList();
    }
}
