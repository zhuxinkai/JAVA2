package cn.Join;

public class ThreadJoinDemo2 extends Thread{


    @Override
    public void run() {
        for(int i = 0;i<100; i++){
            System.out.println(this.getName()+"线程正在运行第"+i+"次");

        }

    }
}
