package WIA1002.Week7Queue;

import java.util.Queue;

public class ITQueueTest {
    public static void main(String[] args) {
        ITQueue<String> que = new ITQueue<>();
        que.add("aa");// 为什么不见了
        que.add("bbbb");// 为什么不见了
        que.add("拜拜");// 为什么不见了
        que.add("ZHANG");
        que.add("WEI");
        que.add("Cris");
        que.add("无敌");
        que.add("啊");

        System.out.println(que.isEmpty());
        System.out.println(que.size());
        System.out.println(que.poll());
        System.out.println(que.poll());
        System.out.println(que.poll());
        System.out.println(que.poll());

        System.out.println(que.size());
        System.out.println(que.contains("WEI"));
        System.out.println(que.getElement(1));
    }
}
