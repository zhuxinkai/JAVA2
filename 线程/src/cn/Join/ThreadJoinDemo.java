package cn.Join;



public class ThreadJoinDemo {

    //Join 线程会抢先拿到CPU进行执行，然后其他线程再来执行。
    public static void main(String[] args) {
        Thread td1 = new ThreadJoinDemo2();
        Thread td2 = new ThreadJoinDemo2();
        Thread td3 = new ThreadJoinDemo2();
        int priorityVaule = td1.getPriority();
        System.out.println("线程的默认优先级是"+priorityVaule);
        //通过Thread 的方法，setPriority 方式，对线程的优先级进行设置。

        try {
            //join 方法必须在start 方法之后，才能有效果。
            td1.start();
            td1.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        td2.start();
        td3.start();



    }
}
