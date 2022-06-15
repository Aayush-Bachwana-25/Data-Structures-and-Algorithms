package LinkedList.$1_SinglyLinkedList;

public class SL_2_searchElement {
    public static void main(String[] args) {
        int arr[]={12,15,7,19,23};
        SinglyLinkedList ls=new SinglyLinkedList(arr);

        int result=ls.searchElement(23);

        if(result==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index:: "+result);
        }
    }
}
