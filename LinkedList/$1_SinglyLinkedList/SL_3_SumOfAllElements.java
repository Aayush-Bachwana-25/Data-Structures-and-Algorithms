package LinkedList.$1_SinglyLinkedList;

public class SL_3_SumOfAllElements {
    public static void main(String[] args) {

        int arr[]={12,15,7,19,23};
        SinglyLinkedList ls=new SinglyLinkedList(arr);

        int result=ls.sumOfAllElements();
        System.out.println("Sum of elements ::"+result);
    }
}
