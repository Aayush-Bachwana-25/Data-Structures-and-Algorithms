package Queue;

public class $4Circular_Queue_Implementation {
    public static void main(String[] args) {
        $4Circular_Queue circular_queue=new $4Circular_Queue(7);

        circular_queue.enqueue(10);
        circular_queue.displayQueue();

        circular_queue.enqueue(20);
        circular_queue.displayQueue();

        circular_queue.enqueue(30);
        circular_queue.displayQueue();

        circular_queue.enqueue(40);
        circular_queue.displayQueue();

        circular_queue.enqueue(50);
        circular_queue.displayQueue();

        circular_queue.enqueue(60);
        circular_queue.displayQueue();

        circular_queue.enqueue(70);
        circular_queue.displayQueue();

        circular_queue.enqueue(80);
        circular_queue.displayQueue();

        circular_queue.enqueue(90);
        circular_queue.displayQueue();

        circular_queue.dequeue();
        circular_queue.displayQueue();

        circular_queue.dequeue();
        circular_queue.displayQueue();

        circular_queue.dequeue();
        circular_queue.displayQueue();

        circular_queue.dequeue();
        circular_queue.displayQueue();

        circular_queue.dequeue();
        circular_queue.displayQueue();

        circular_queue.dequeue();
        circular_queue.displayQueue();


    }
}
