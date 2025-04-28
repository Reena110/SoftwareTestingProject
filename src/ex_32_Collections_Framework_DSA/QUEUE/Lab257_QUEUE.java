package ex_32_Collections_Framework_DSA.QUEUE;

import java.util.PriorityQueue;

public class Lab257_QUEUE
{
    public static void main(String[] args) {
        PriorityQueue pq  = new PriorityQueue();
        pq.add("Reena");
        pq.add("Singh");
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);

        // PQ is do natural sorting
    }
}
