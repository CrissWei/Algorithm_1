package WIA1002LabAssignment.Lab7Queue.ITheiMa;
/**
 * @name Wei Zhang
 * @ID S2004131
 * @Date 2022/6/17
 * */
public class ITQueueTest {
    public static void main(String[] args) {
        ITQueue<String> que = new ITQueue<>();
        que.add("aa");// 为什么不见了
        que.add("bbb");// 为什么不见了
        que.add("拜拜");// 为什么不见了
        que.add("ZHANG");
        que.add("WEI");
        que.add("Cris");
        que.add("无敌");
        que.add("啊aa");
        System.out.println("=======遍历所有元素========");
        que.displayAll();
        System.out.println("===============");

        System.out.println(que.isEmpty());
        System.out.println(que.getSize());
        System.out.println(que.poll());
        System.out.println(que.poll());
        System.out.println(que.poll());
        System.out.println(que.poll());

        System.out.println(que.getSize());
        System.out.println(que.contains("WEI"));//还没写实现内容
        System.out.println(que.contains("Cris"));//还没写实现内容
        System.out.println(que.contains("无敌"));//还没写实现内容
        System.out.println(que.contains("啊aa"));//还没写实现内容
        System.out.println(que.contains("什么鬼"));//还没写实现内容

        System.out.println("=======遍历所有元素========");
        que.displayAll();
        System.out.println("===============");

        System.out.println(que.getElement(0));//还没写.......
        System.out.println(que.getElement(1));//还没写.......
        System.out.println(que.getElement(2));//还没写.......
        System.out.println(que.getElement(3));//还没写.......
        System.out.println(que.getElement(4));//还没写.......
        System.out.println(que.getElement(5));//还没写.......

        System.out.println("=======");
        que.displayAll();
        que.changeOrder(2);//非常正确
        System.out.println("===");
        que.displayAll();

    }
}
