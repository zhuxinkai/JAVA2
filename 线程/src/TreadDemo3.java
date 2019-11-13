public class TreadDemo3 implements Runnable {
    public static void main(String[] args) {

    }

    public int ticket = 100;


    @Override
    public void run() {
     saleTicket();

        }
        public void saleTicket(){

            while (true) {
                //将代码段，放在与synchronized 段中。
                //如果不是静态的方法，Synchronized 如果加在对象方法上，那么他的共享锁是this

                synchronized (this) {
                    if (ticket == 0) {

                        System.out.println("票已售完");
                        break;

                    }
                    try {
                        Thread.sleep(10);
                        System.out.println(Thread.currentThread().getName() + ticket-- + "张票");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }

        }
    }

