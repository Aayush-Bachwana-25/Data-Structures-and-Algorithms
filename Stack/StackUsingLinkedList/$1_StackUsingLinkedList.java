package Stack.StackUsingLinkedList;

class Stack{
    class SinglyLinkedList{
        class Node{
            int data;
            Node next;

            Node(int data){
                this.data=data;
                this.next=null;
            }
        }

        Node head,top;

        SinglyLinkedList(){
            top=head;
        }

        Node createNode(int data){
            Node temp=new Node(data);
            return  temp;
        }
        }

    SinglyLinkedList s;

    Stack(){
        s=new SinglyLinkedList();
    }

    void push(int data){
        if(s.head==null){
            s.head=s.createNode(data);
            s.top=s.head;
        }
        //Stack overflow not possible
        else{
            SinglyLinkedList.Node temp=s.createNode(data);
            temp.next=s.head;
            s.head=temp;
            s.top=s.head;
        }
        System.out.println("Element pushed::"+data);
    }

    int pop(){
        int x;
        if(s.head==null){
            System.out.println("Stack Underflow");
            return -1;
        }
        else{
            x=s.head.data;
            System.out.println("Element popped::"+s.head.data);
            s.head=s.head.next;
        }
        return  x;
    }
    void displayStack(){
        System.out.println();

        System.out.println("Elements are::");

        System.out.println("\\       /");
        SinglyLinkedList.Node p=s.head;
        while(p!=null){
            System.out.println(" | "+p.data+" | ");
            p=p.next;
        }
        System.out.println("  ----- ");
    }

    int peek(){
        return s.head.data;
    }

    boolean isEmpty(){
        if(s.head==null){
            return  true;
        }
        return  false;
    }



}

public class $1_StackUsingLinkedList {
    public static void main(String[] args) {
        Stack st=new Stack();

        System.out.println(st.isEmpty());       //Returns true if Stack is Empty

        //Pushing elements into stack
        for(int i=1;i<=10;i++){
            st.push(10*i);
        }

        //Displaying Stack
        st.displayStack();

        //Popping elements from stack
        for(int i=0;i<5;i++){
            st.pop();
        }
        st.displayStack();

        System.out.println("Peek::"+st.peek());     //Returns element at top without removing

        System.out.println(st.isEmpty());           //Returns true if Stack is Empty
    }
}
