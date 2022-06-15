package Queue;

public class $5Queue_Using_LinkedList {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    Node front,rear;

    boolean isEmpty(){
        if(front==rear && front==null){
            return true;
        }
        return false;
    }

    void enqueue(int data){
        Node temp=new Node(data);

        if(isEmpty()){
            front=rear=temp;
        }
        else{
            rear.next=temp;
            rear=rear.next;
        }
    }

    int dequeue(){
        int data;
        if(!isEmpty()){
            data= front.data;
            front=front.next;
            if(front==null){
                rear=null;
            }
            return data;
        }
        System.out.println("Queue underflow");
        return -1;
    }

    void displayQueue(){
        if(!isEmpty()){
            System.out.println("front::"+front.data+"\t"+"Rear::"+rear.data);
        }
        else {
            System.out.println("Queue is Empty");
        }
    }
}
