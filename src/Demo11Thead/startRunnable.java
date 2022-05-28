package Demo11Thead;
/*
*
多线程的实现方案有两种
    1.继承Thread类
    2.实现Runnable接口（推荐这个方法）
*
    相比继承Thread类，实现Runnable接口的好处:
        1.避免了Java单继承的局限性, startRunnable还能去继承一个别的类,而不是Thread类
        2.适合多个相同程序的代码去处理同一个资源的情况，
          把线程和程序的代码、数据有效分离，较好的体现了面向对象的设计思想


* */
public class startRunnable {
    //内部类
    static class myRunnable implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                //获得当前主线程的名字
                System.out.println(Thread.currentThread().getName()+": "+i);
            }
        }
    }

    public static void main(String[] args) {
        //创建内部类对象
        myRunnable my = new myRunnable();

        //Thread类是的Runnable接口的实现类
        Thread t1 = new Thread(my,"飞机");
        Thread t2 = new Thread(my,"高铁");

        t1.start();
        t2.start();
    }



}
