package LinkedList.$1_SinglyLinkedList;

public class SL_4_Maximim_and_Minimum_Value {
    public static void main(String[] args) {
        int arr[]={12,15,7,19,23};
        SinglyLinkedList ls=new SinglyLinkedList(arr);

        int max=ls.getMaximum();
        int min=ls.getMinimum();

        System.out.println("Maximum value::"+max);
        System.out.println("Minimum value::"+min);
    }
}
