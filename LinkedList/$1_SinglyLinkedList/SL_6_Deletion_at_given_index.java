package LinkedList.$1_SinglyLinkedList;

import java.util.Scanner;

public class SL_6_Deletion_at_given_index {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        SinglyLinkedList ls=new SinglyLinkedList(arr);
        ls.displayList();

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter index:: ");
        int index=sc.nextInt();

        int result=ls.pop(index);
        if(result==-1){
            System.out.println("Deletion Unsuccessful..Invalid Index");
        }
        else{
            System.out.println("Element deleted");
        }
        ls.displayList();
    }
}
