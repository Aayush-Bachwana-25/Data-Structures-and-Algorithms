package LinkedList.$1_SinglyLinkedList;

import java.util.HashSet;

public class  SinglyLinkedList{
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    Node head,tail;
    int no_of_nodes;

    SinglyLinkedList(){
        head=tail=null;
        no_of_nodes=0;
    }
    SinglyLinkedList(int arr[]){
        head = tail = new Node(arr[0]);
        no_of_nodes++;

        for(int i=1;i< arr.length;i++){
            Node temp = new Node(arr[i]);
            tail.next=temp;
            tail=tail.next;
            no_of_nodes++;
        }
    }
    void displayList(){
        Node p=head;
        System.out.print("List is :: ");
        while(p!=null){
            System.out.print(p.data+" ");
            p=p.next;
        }
        System.out.print("                  ");
        System.out.print("No. of Nodes:: "+ no_of_nodes);

        System.out.print("                  ");
        System.out.print("Head:: "+head.data);
        System.out.print("                  ");
        System.out.print("Tail:: "+tail.data);

        System.out.println();
    }

    int searchElement(int value)
    {
        int index=0;
        Node p=head;

        while(p!=null){
            if(p.data==value){
                return index;
            }
            index++;
            p=p.next;
        }
        return -1;
    }

    int ImprovedLinearSearchElement(int value)
    {
        int index=0;
        Node p=head;
        Node prev=null;

        while(p!=null){
            if(p.data==value){
                Node temp=p;
                prev.next=temp.next;
                temp.next=head;
                head=temp;
                return index;

            }
            prev=p;
            index++;
            p=p.next;
        }
        return -1;
    }

    int sumOfAllElements(){
        int sum=0;
        Node p=head;

        while(p!=null){
            sum+=p.data;
            p=p.next;
        }
        return sum;
    }

    int getMaximum(){
        int max= Integer.MIN_VALUE;
        Node p=head;

        while(p!=null){
            if(max<p.data){
                max=p.data;
            }
            p=p.next;
        }
        return max;
    }

    int getMinimum(){
        int min= Integer.MAX_VALUE;
        Node p=head;

        while(p!=null){
            if(min>p.data){
                min=p.data;
            }
            p=p.next;
        }
        return min;
    }

    int insert(int pos,int value){
        if(pos>0 && pos<=no_of_nodes+1){
            no_of_nodes++;
            Node temp=new Node(value);

            if(pos==1){
                temp.next=head;
                head=temp;
            }
            if(pos==no_of_nodes){
                tail.next=temp;
                tail=temp;
            }
            else{
                Node p=head;
                for(int i=0;i<pos-2;i++){
                    p=p.next;
                }
                temp.next=p.next;
                p.next=temp;
            }
        }
        else{
            return -1;
        }
        return 0;
    }

    int pop(int index){
        if(index>=0 && index< no_of_nodes){
            no_of_nodes--;
            if (index==0){
                Node temp=head.next;
                head=temp;
            }
            else{
                Node p=head;
                Node prev=null;
                for(int i=0;i<index;i++){
                    prev=p;
                    p=p.next;
                }
                prev.next=p.next;
                if(index==no_of_nodes){
                    tail=prev;
                }
            }
        }
        else{
            return -1;
        }
        return 0;
    }

    int remove(int value){
        int result=searchElement(value);
        if(result==-1){
            return -1;
        }
        else{
            int result2=pop(result);
            return  result2;
        }
    }

    void removeDuplicatesSorted(){
        Node q=head;
        Node p=head.next;

        while (p!=null){
            if(q.data==p.data){
                no_of_nodes--;
                q.next=p.next;
                p=q.next;
                continue;
            }
            q=p;
            p=p.next;
        }
        System.out.println("Duplicates removed ..if any");
    }

    void removeDuplicatesUnsortedUsingForLoop(){
        Node p=head;

        while(p.next!=null) {
            Node q = p.next;
            Node tail = p;
            while (q != null) {
                int flag=0;
                if (p.data == q.data) {
                    flag=1;

                    tail.next=q.next;
                    no_of_nodes--;
                }
                if(flag==0){tail = q;}      //flag is used because it prevents temp to reach an unaccessed location.
                q = q.next;
            }
            p = p.next;
        }
    }

    void removeDuplicatesUnsortedUsingHashTable() {
        int max = getMaximum();
        int hashT[] = new int[max + 1];

        Node p = head;
        Node prev = null;
        while (p != null) {
            int flag = 1;

            if (hashT[p.data] == 1) {
                flag = 0;
                //remove(p)
                no_of_nodes--;
                prev.next = p.next;
            } else {
                hashT[p.data] = 1;
            }
            if (flag == 1) {
                prev = p;
            }    //This operation not to be done if element is removed.
            p = p.next;

        }
    }

    void reverseUsingAuxillaryArray(){
        int arr[]=new int[no_of_nodes];
        Node p=head;
        int i=0;
        while (p!=null){
            arr[i++]=p.data;
            p=p.next;
        }
        p=head;
        for(int j=no_of_nodes-1;j>=0;j--){
            p.data=arr[j];
            p=p.next;
        }
    }


    void reverseUsingTailingPointers(){
        Node p,q,r;
        r=null;
        q=head;
        p=head.next;

        while (p.next!=null) {
            //Reversing links
            q.next = r;

            //Setting up Pointers
            r = q;
            q = p;
            if(p.next!=null){p = p.next;}
        }
        if(p.next==null){
            q.next=r;
            p.next=q;
            head=p;
            //terminate function here
        }
    }

    SinglyLinkedList concatenate(SinglyLinkedList l){
        SinglyLinkedList lRes=new SinglyLinkedList();

        lRes.head=head;
        lRes.tail=tail;
//        Node p= lRes.head;
//        while (p.next!=null){
//            p=p.next;
//        }
//        p.next=l.head;
        lRes.tail.next=l.head;
        lRes.tail=l.tail;

        lRes.no_of_nodes=no_of_nodes+l.no_of_nodes;
        return lRes;
    }

    SinglyLinkedList mergeSorted(SinglyLinkedList ls){
        SinglyLinkedList lsRes=new SinglyLinkedList();

        Node p=head;
        Node q=ls.head;

        if(p.data>q.data){
            lsRes.tail= lsRes.head=q;
            q=q.next;
        }
        else{
            lsRes.tail= lsRes.head=p;
            p=p.next;
        }

        while(p!=null && q!=null){
            if(p.data<q.data){
                lsRes.tail.next=p;
                lsRes.tail= lsRes.tail.next;
                p=p.next;
            }
            else {
                lsRes.tail.next=q;
                lsRes.tail= lsRes.tail.next;
                q=q.next;
            }
        }
        if(p!=null){
            lsRes.tail.next=p;
            lsRes.tail= tail;
        }
        if(q!=null){
            lsRes.tail.next=q;
            lsRes.tail= ls.tail;
        }

        lsRes.no_of_nodes=no_of_nodes+ls.no_of_nodes;
        return lsRes;
    }

    boolean detectLoopUsingHashSet(){
        Node p=head;
        HashSet <Node> s=new HashSet<>();

        while(p!=null){
            if(s.contains(p)){
                return true;
            }
            else{
                s.add(p);
                p=p.next;
            }
        }
        return false;
    }
    void createLoop(){
        tail.next=head.next.next;
    }
    boolean detectLoopUsingFloydCycleAlgo(){
        Node p=head;            //slow_pointer
        Node q=head.next.next;  //fast_pointer

        while(p!=null && q!=null &&  q.next!=null){
            if(p==q){
                return true;
            }
            p=p.next;
            q=q.next.next;
        }
        return false;
    }
}


