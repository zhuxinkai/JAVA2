package cn.telecom.Thread;

public class BuyFruite implements Runnable {
    private Fruite fr;
    private String fruitename;


    public BuyFruite(Fruite fr) {
        super();
        this.fr = fr;
    }

    public static void main(String[] args) {

    }

    @Override
    public void run() {
        while(true){

            synchronized (fr) {
                if (!fr.isExcist()) {
                    try {
                        fr.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                //wait和notify 一定是成对出现
                } else {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("已经买了" + fr.getName());
                    fr.notify();
                    fr.setExcist(false);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }




        }



    }
}

