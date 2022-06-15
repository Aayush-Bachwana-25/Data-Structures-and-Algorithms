package LinkedList.$1_SinglyLinkedList;

public class SL_13_DetectLoopInLinkedList {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        SinglyLinkedList ls=new SinglyLinkedList(arr);
        ls.createLoop();
        //ls.displayList();

        boolean res=ls.detectLoopUsingHashSet();
        System.out.println(res);

        boolean res1=ls.detectLoopUsingFloydCycleAlgo();
        System.out.println(res1);
    }
}
