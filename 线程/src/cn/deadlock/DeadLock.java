package cn.deadlock;

public class DeadLock {
    public static void main(String[] args) {
        DeadLock2 dl1 = new DeadLock2(true);
        DeadLock2 dl2 = new DeadLock2(false);



        Thread td1 = new Thread(dl1);
        Thread td2 = new Thread(dl2);
        td1.start();
        td2.start();

    }
    //新建两个对象，用于并发锁。
   static Object lock1 = new Object();
   static Object lock2 = new Object();



}
