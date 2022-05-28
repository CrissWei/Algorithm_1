package WIA1002.Week7Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue2 {
    public static void main(String[] args) {
        Queue<String> pq = new PriorityQueue<>(10);
        pq.add("F");
        pq.add("D");
        pq.add("c");
        pq.add("a");
        pq.add("E");
        pq.add("A");
        pq.add("BB");
        pq.add("G");
        pq.add("C");
        pq.add("B");

        System.out.println(pq.contains("BB"));
        System.out.println(pq.contains("bb"));
        System.out.println(pq.contains("F"));
    }
}
