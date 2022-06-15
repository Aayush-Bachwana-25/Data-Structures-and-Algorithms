package Queue;

public class $4Circular_Queue {
    private int size;
    private int front,rear;
    private int []queue;

    $4Circular_Queue(int size){
        this.size=size;
        queue=new int[size];
        front=rear=0;
    }

    boolean isFull(){
        if((rear+1)%size==front){
            System.out.println("Queue is Full");
            return true;
        }
        return false;
    }

    boolean isEmpty(){
        if(rear==front){
            System.out.println("Queue Underflow");
            return true;
        }
        return false;
    }

    boolean enqueue(int data){
        if(!isFull()){
            rear=(rear+1)%size;
            queue[rear]=data;
            return true;
        }
        return false;
    }

    int dequeue(){
        int data;
        if(!isEmpty()){
            front=(front+1)%size;
            data=queue[front];
            queue[front]=Integer.MIN_VALUE;
            return data;
        }
        return -1;
    }

    void displayQueue(){
        System.out.println("first element::"+queue[(front+1)%size]);
        System.out.println("last element::"+queue[rear]);
        System.out.println();
    }
}
