package Queue;

import java.util.Scanner;

public class $1Queue_Using_SinglePointer {
    int size;
    int queue[];
    int rear;

    $1Queue_Using_SinglePointer(){
        Scanner s=new Scanner(System.in);

        System.out.print("Enter size of queue::");
        size=s.nextInt();

        queue=new int[size];

        rear=-1;
    }

    boolean isFull(){
        if(rear==size-1){
            return true;
        }
        return false;
    }

    boolean isEmpty(){
        if(rear==-1){
            return true;
        }
        return false;
    }

    boolean enqueue(int data){
        if(!isFull()){
            rear=rear+1;
            queue[rear]=data;
            return true;
        }
        return false;
    }

    int dequeue(){
        if(!isEmpty()){
            int data=queue[0];
            rear=rear-1;

            for(int i=0;i<size-1;i++){
                queue[i]=queue[i+1];
            }
            return data;
        }
        return -1;
    }

    void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }
        else{
            System.out.print("Queue is::\t");
            for(int i=0;i<=rear;i++){
                System.out.print(queue[i]+" ");
            }
            System.out.println();
        }
    }
}


