package WIA1002.Week7Queue;

public class testMyQueue {
    public static void main(String[] args) {
        TestAPI1 t1 = new TestAPI1();
        t1.offer(5);
        t1.offer(2);
        t1.offer(3);
        System.out.println(t1.poll());
        System.out.println(t1.poll());
        System.out.println(t1.poll());
        System.out.println(t1.poll());
    }
}
