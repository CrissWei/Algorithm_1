package Demo11Thead;

public class StartThread {
    //内部类
    static class myThread2 extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                //获取线程名称
                System.out.println(getName()+": "+ i);
            }
        }
    }
    public static void main(String[] args) {
        myThread2 m1 = new myThread2();
        myThread2 m2 = new myThread2();
        myThread2 m3 = new myThread2();
        //run：  不启动线程，start才启动 ,run相当普通方法
        //start: 启动线程，由JVM调用此线程的run方法

        m1.setName("火车");
        m2.setName("高铁");
        m3.setName("飞机");

        // 1-10之间设置优线程执行的先级别，10最优先执行，1最后执行
        m1.setPriority(1);
        m2.setPriority(5);
        m3.setPriority(10);

        //启动线程
        m1.start();
        m2.start();
        m3.start();
    }
}
