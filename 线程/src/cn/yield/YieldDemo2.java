package cn.yield;

public class YieldDemo2 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.getName() + "线程正在运行第" + i + "次");
            Thread.yield();


        }
    }
}
