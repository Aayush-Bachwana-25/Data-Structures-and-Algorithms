package Queue;

public class $1Queue_using_SinglePointer_Implementation {
    public static void main(String[] args) {
        $1Queue_Using_SinglePointer q=new $1Queue_Using_SinglePointer();

        q.display();

        q.enqueue(25);
        q.enqueue(36);
        q.enqueue(31);
        q.enqueue(43);
        q.enqueue(52);
        q.enqueue(69);

        q.display();

        q.dequeue();
        q.display();

        q.dequeue();
        q.display();

        q.dequeue();
        q.display();

        //Adding elements until queue gets full
        for(int i=1;i<=10;i++){
            boolean flag=q.enqueue(i*25);
            q.display();

            if(flag==false){
                System.out.println("Queue is Full!");
            }
        }
        q.display();
    }
}
