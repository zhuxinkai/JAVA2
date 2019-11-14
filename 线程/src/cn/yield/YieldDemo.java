package cn.yield;

import cn.Join.ThreadJoinDemo2;

public class YieldDemo {


    //Join 线程会抢先拿到CPU进行执行，然后其他线程再来执行。
    public static void main(String[] args) {
        // Thread td1 = new ThreadJoinDemo2();
        Thread td2 = new YieldDemo2();
        Thread td3 = new YieldDemo2();
        //int priorityVaule = td1.getPriority();
        //  System.out.println("线程的默认优先级是"+priorityVaule);

        td2.start();
        td3.start();


    }
}
