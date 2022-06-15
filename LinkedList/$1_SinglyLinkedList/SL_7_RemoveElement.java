package LinkedList.$1_SinglyLinkedList;

import java.util.Scanner;

public class SL_7_RemoveElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        SinglyLinkedList ls=new SinglyLinkedList(arr);
        ls.displayList();

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter value to remove:: ");
        int value=sc.nextInt();
        int result=ls.remove(value);

        if(result==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element deleted");
        }
        ls.displayList();

    }
}
