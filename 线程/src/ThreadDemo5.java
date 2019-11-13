public class ThreadDemo5 {
    public static void main(String[] args) {

        ThreadDemo4 countThread = new ThreadDemo4("窗口1正在卖第 ");
        ThreadDemo4 countThread2 = new ThreadDemo4("窗口2正在卖第 ");
        ThreadDemo4 countThread3 = new ThreadDemo4("窗口3正在卖第 ");
        ThreadDemo4 countThread4 = new ThreadDemo4("窗口4正在卖第 ");
        countThread.start();
        countThread2.start();
        countThread3.start();
        countThread4.start();



    }



}
