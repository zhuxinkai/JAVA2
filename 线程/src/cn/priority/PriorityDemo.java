package cn.priority;

public class PriorityDemo {
    public static void main(String[] args) {
        Thread td1 = new ThreadDemoPriority();
        Thread td2 = new ThreadDemoPriority();
        Thread td3 = new ThreadDemoPriority();
        int priorityVaule = td1.getPriority();
        System.out.println("线程的默认优先级是"+priorityVaule);
        //通过Thread 的方法，setPriority 方式，对线程的优先级进行设置。
        td1.setPriority(10);
        td1.start();
        td2.start();
        td3.start();



    }

}
