package Queue;

public class $2Queue_Using_TwoPointers {
    protected int[] queue;
    protected int front,rear;
    protected int size;

    $2Queue_Using_TwoPointers(int size){
        this.size=size;
        this.front=this.rear=-1;
        this.queue=new int[size];
    }

    boolean isFull(){
        if(rear==size-1){
            System.out.println("Queue is Full");
            return true;
        }
        return false;
    }

    boolean isEmpty(){
        if(front==rear){
            System.out.println("Queue is Empty");
            return true;
        }
        return false;
    }

    boolean enqueue(int data){
        if(!isFull()){
            queue[++rear]=data;
            return true;
        }
        return false;
    }

    boolean dequeue(){
        if(!isEmpty()){
            int data=queue[++front];
            queue[front]= Integer.MIN_VALUE;
            return true;
        }
        return false;
    }

    int getFirst(){
        if(!isEmpty()){
            System.out.println("First::"+queue[front+1]);
            return queue[front+1];
        }
        return -1;
    }

    int getLast(){
        if(!isEmpty()){
            System.out.println("Rear::"+queue[rear]);
            return queue[rear];
        }
        return -1;
    }

    void displayQueue(){
        getFirst();
        getLast();
        System.out.println();
    }
}
