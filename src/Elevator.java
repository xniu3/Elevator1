import java.util.PriorityQueue;


public class Elevator implements Runnable{
    public Elevator(){
        this.currFloor = 1;
        this.direction = 0;
        this.queue = new RequestQueue();
    }
}
