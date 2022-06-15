package LinkedList.$1_SinglyLinkedList;

import java.util.Scanner;

public class SL_5_Insertion_at_given_position {
    public static void main(String[] args) {

        int arr[]={12,15,7,19,23};
        SinglyLinkedList ls=new SinglyLinkedList(arr);
        ls.displayList();

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value:: ");
        int value=sc.nextInt();
        System.out.print("Enter the position:: ");
        int pos=sc.nextInt();

        int flag=ls.insert(pos,value);

        if(flag==-1){
            System.out.println("Insertion failed..Invalid position");
        }
        else{
            System.out.println("Element Insertion Successful");
        }
        ls.displayList();
    }
}
