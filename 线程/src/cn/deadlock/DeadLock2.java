package cn.deadlock;

public class DeadLock2 implements Runnable {
    public static void main(String[] args) {

    }

   private boolean flag;

    public DeadLock2(boolean flag) {
        super();
        this.flag = flag;
    }

    @Override
    public void run() {
//构造器方式，传递不同的flag.来进行不同的线程。
        if(flag){
            //利用类的对象来做并发锁
            synchronized (DeadLock.lock1){
                System.out.println(Thread.currentThread().getName()+" 已经拿到了锁1，准备拿锁2");
                   synchronized (DeadLock.lock2){

                       System.out.println(Thread.currentThread().getName()+"已经拿到锁2");
                   }

            }


        }else{
            synchronized (DeadLock.lock2){
                System.out.println(Thread.currentThread().getName()+" 已经拿到了锁2，准备拿锁1");
                synchronized (DeadLock.lock1){
                    System.out.println(Thread.currentThread().getName()+"已经拿到锁1");
                }
            }



        }




    }
}
