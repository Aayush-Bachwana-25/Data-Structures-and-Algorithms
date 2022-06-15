package Stack.StackUsingArray;

import java.util.Scanner;

class Stack{
    private int size,top;
    private int[] arr;

    Stack(){
        top=-1;

        System.out.print("Enter size of stack::");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        arr=new int[size];
        System.out.print("Enter Stack values::");
        for(int i=0;i<size;i++){
           arr[i]=sc.nextInt();
           push(arr[i]);
        }
    }

    int push(int data){
        if(top==size-1){
            System.out.println("Stack Overflow");
            return -1;
        }
        else{
            System.out.println("Element pushed::"+data);
            top++;
            arr[top]=data;
        }
        return 1;
    }

    int pop(){
        int x;
        if(top==-1){
            System.out.println("Stack Underflow");
            return -1;
        }
        else{
            x=arr[top];
            arr[top]=0;
            top--;
            System.out.println("Element popped::"+x);
        }
        return x;
    }

    int peek(){
        if(top==-1){
            System.out.println("Stack Underflow");
            return -1;
        }
        else{
            return arr[top];
        }
    }

    void display(){
        System.out.print("Stack:: ");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    boolean isEmpty(){
        if(top==-1){
            return  true;
        }
        return  false;
    }

    boolean isFull(){
        if(top==size-1){
            return  true;
        }
        return  false;
    }
}



public class $1_StackUsingArray {
    public static void main(String[] args) {
        Stack s=new Stack();

        s.display();

        s.pop();
        s.pop();

        s.display();

        System.out.println("Top element::"+s.peek());
        System.out.println(s.isEmpty());
        System.out.println(s.isFull());

    }
}


