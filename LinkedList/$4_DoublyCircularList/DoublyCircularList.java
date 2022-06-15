package LinkedList.$4_DoublyCircularList;

import MyLinkedLists.DoublyLinkedList.DoublyLinkedList;

public class DoublyCircularList {
    class Node{
        int data;
        Node prev;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    Node head;
    DoublyCircularList(int arr[]){
        head=new Node(arr[0]);
        Node p=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            p.next=temp;
            temp.prev=p;
            p=p.next;

            if(i== arr.length-1){
                p.next=head;
                head.prev=p;
            }
        }
    }

    void displayList(){
        Node p=head;

        System.out.print("List is:: ");
        do{
            System.out.print(p.data+" ");
            p=p.next;
        }while(p!=head);

        System.out.println();
    }

    //Reverse traversing using "prev" pointer
    void reverseDisplayList(){
        Node p=head;
        System.out.print("List is:: ");
        do{
            System.out.print(p.data+" ");
            p=p.prev;
        }while(p!=head);

        System.out.println();
    }
}
