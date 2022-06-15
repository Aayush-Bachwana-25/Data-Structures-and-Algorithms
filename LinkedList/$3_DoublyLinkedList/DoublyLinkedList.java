package LinkedList.$3_DoublyLinkedList;

public class DoublyLinkedList {
    class Node{
        int data;
        Node prev;
        Node next;
        
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    Node head,tail;
    
    DoublyLinkedList(int arr[]){
        tail=head=new Node(arr[0]);

        for(int i=1;i< arr.length;i++){
            Node temp=new Node(arr[i]);
            tail.next=temp;
            temp.prev=tail;
            tail=temp;
        }
    }

    void displayList(){
        Node p=head;
        System.out.print("List is:: ");
        while(p!=null){
            System.out.print(p.data+" ");
            p=p.next;
        }
        System.out.println();
    }

    //Reverse traversing using "prev" pointer
    void reverseDisplayList(){
        Node p=tail;
        System.out.print("Reverse Display of List is:: ");
        while(p!=null){
            System.out.print(p.data+" ");
            p=p.prev;
        }
        System.out.println();
    }
    
    
}
