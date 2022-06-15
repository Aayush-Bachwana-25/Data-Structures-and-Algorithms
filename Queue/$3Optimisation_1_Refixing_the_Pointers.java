package Queue;

public class $3Optimisation_1_Refixing_the_Pointers extends $2Queue_Using_TwoPointers{
    $3Optimisation_1_Refixing_the_Pointers(int size) {
        super(size);
    }
    // Every time when Queue becomes empty;
    // we are setting up the pointers to front=rear=-1;
    // So,that we can reuse all the locations which was inaccessible till now once they're used
    @Override
    boolean dequeue() {
        if(!isEmpty()){
            int data=queue[++front];
            queue[front]= Integer.MIN_VALUE;
            if(isEmpty()){
                front=rear=-1;
            }
            return true;
        }
        return false;
    }
}
