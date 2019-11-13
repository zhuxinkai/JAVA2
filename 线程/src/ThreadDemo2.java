public class ThreadDemo2 {
    public static void main(String[] args) {
        /* 第一种实现线程的方式
        ThreadDemo countThread = new ThreadDemo("线程1");
        ThreadDemo countThread2 = new ThreadDemo("线程2");
       // countThread.setName("线程1");
       // countThread2.setName("线程2");
       *
         */


        /*
        第二种方法实现线程。为什么需要有两种方法实现线程，时因为，假如 ThreadDemo已经是别的类的子类了，无法
        作为Thread 的子类，那么就需要使用 implements Runnable的方式来实现。
        利用Thread的构造器实现。
        Thread(Runnable target, String name)
        分配一个新的 Thread对象。
         */
        TreadDemo3 td3 = new TreadDemo3();

        Thread countThread = new Thread(td3,"窗口1正在卖第");
        Thread countThread2 = new Thread(td3,"窗口2在卖第");
        Thread countThread3= new Thread(td3,"窗口3在卖第");
        Thread countThread4= new Thread(td3,"窗口4在卖第");



        countThread.start();
        countThread2.start();
        countThread3.start();
        countThread4.start();

        /*
        当实现的是Thread时，无法出现线程阻塞的情况。  当用ThreadDemo 的时候，则可以出现线程阻塞，而形成的
        线程交替执行的现象。
         */


    }
}
