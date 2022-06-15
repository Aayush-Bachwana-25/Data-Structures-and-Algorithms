package LinkedList.$4_DoublyCircularList;

public class DCL_1_CreateAndDisplay {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};

        DoublyCircularList dcl=new DoublyCircularList(arr);
        dcl.displayList();
        dcl.reverseDisplayList();
    }
}
