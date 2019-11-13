public class ThreadDemo4 extends Thread {
    //利用构造器来实现改线程名字。
    String tName;

    //必须加入static 变成类的属性。否则，每个对象NEW 一个，会生成4个对象属性。都是100；

    private static int ticket = 100;
    //新建一个对象，用于共享方式的调度，"同步锁"。
    private static Object obj = new Object();

    public ThreadDemo4() {

    }

    public ThreadDemo4(String tName) {
        //调用了 父类 Thread的构造器。
        // Thread(String name)
        //分配一个新的 Thread对象。
        super(tName);
    }

    public static void main(String[] args) {

    }

    @Override
    public void run() {

            while (true) {
                //将代码段，放在与synchronized 段中。

                synchronized (obj) {
                if (ticket == 0) {

                    System.out.println("票已售完");
                    break;

                }
               try {
                    Thread.sleep(100);
                    System.out.println(this.getName() + ticket-- + "张票正在被售卖");
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }

            }
        }


    }
}
