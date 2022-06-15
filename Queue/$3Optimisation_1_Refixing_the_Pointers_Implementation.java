package Queue;

public class $3Optimisation_1_Refixing_the_Pointers_Implementation {
    public static void main(String[] args) {
        $3Optimisation_1_Refixing_the_Pointers qs=new $3Optimisation_1_Refixing_the_Pointers(5);

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
