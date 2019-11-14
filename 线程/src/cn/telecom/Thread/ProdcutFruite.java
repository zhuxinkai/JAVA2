package cn.telecom.Thread;

public class ProdcutFruite implements Runnable {
    private Fruite fr;
    private String fruitename;


    public ProdcutFruite(Fruite fr) {
        super();
        this.fr = fr;
    }

    public static void main(String[] args) {

    }

    @Override
    public void run() {
        while(true){
            synchronized (fr){
                if(fr.isExcist()){
                    try {
                        fr.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }else {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("现在已经有可以买的"+fr.getName());
                    fr.notify();
                    fr.setExcist(true);
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
