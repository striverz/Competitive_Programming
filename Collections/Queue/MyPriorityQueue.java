package Collections.Queue;

import java.util.PriorityQueue;

public class MyPriorityQueue {
    public static void main(String[] args) {
        //It is also Known as Min heap
        PriorityQueue<Integer>pq=new PriorityQueue<>();

        pq.offer(7);
        pq.offer(5);
        pq.offer(1);
        pq.offer(4);
        pq.offer(-1);

        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.poll();
        }

    }
}
