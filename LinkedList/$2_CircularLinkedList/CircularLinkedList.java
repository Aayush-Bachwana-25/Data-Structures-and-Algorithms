package LinkedList.$2_CircularLinkedList;

public class CircularLinkedList {

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    Node head;

    CircularLinkedList(){
        head=null;
    }

    CircularLinkedList(int arr[]){
        head=new Node(arr[0]);
        Node p=head;

        for(int i=1;i< arr.length;i++){
            Node temp=new Node(arr[i]);
            p.next=temp;
            p=temp;
        }
        p.next=head;
    }

    void displayList(){
        System.out.print("List is:: ");

        Node p=head;
        do{
            System.out.print(p.data+" ");
            p=p.next;
        }while (p!=head);
        System.out.println();
    }
}
