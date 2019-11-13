public class ThreadDemo extends Thread {

    //利用构造器来实现改线程名字。
    String tName;

    public ThreadDemo(){

    }

    public ThreadDemo(String tName) {
        //调用了 父类 Thread的构造器。
        // Thread(String name)
        //分配一个新的 Thread对象。
        super(tName);
    }

    public static void main(String[] args) {

    }

    @Override
    public void run() {
        for (int i = 0; i< 100; i++){


            System.out.println(this.getName()+" Hello word "+i);
        }
    }
}
