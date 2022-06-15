package Queue;

public class $2Queue_Using_TwoPointers_Implementation {
    public static void main(String[] args) {
        $2Queue_Using_TwoPointers qs=new $2Queue_Using_TwoPointers(5);

        for(int i=1;i<=5;i++){
            qs.enqueue(i*10);
            qs.displayQueue();
        }
        for(int i=1;i<8;i++){
            qs.dequeue();
            qs.displayQueue();
        }
    }
}
