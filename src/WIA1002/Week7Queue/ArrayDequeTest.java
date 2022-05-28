package WIA1002.Week7Queue;

import java.util.ArrayDeque;

public class ArrayDequeTest {
    public static void main(String[] args) {
        ArrayDeque<String> que = new ArrayDeque<>();
        que.add("ZHANG");
        que.add("WEI");
        que.add("无敌");
        que.add("帅气");
        que.add("Cris");
        que.add("523");
        for (String s : que) {
            System.out.println(s);
        }
        System.out.println(que.size());
        ArrayDeque<String> clone = que.clone();
        System.out.println(clone.size());

        System.out.println(que.pop());
        System.out.println(clone.size());
        System.out.println(que.size());

        System.out.println(que.getFirst());
        System.out.println(que.getLast());

        System.out.println(que.peekFirst());
        System.out.println(que.peekLast());

        System.out.println(que.pollFirst());
        System.out.println(que.pollLast());
        System.out.println(que.size());
        que.addFirst("第一");
        que.addLast("最后");

        for (String s : que) {
            System.out.println(s);
        }

        for (String s : clone) {
            System.out.println(s);
        }
    }
}
