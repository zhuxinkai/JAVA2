package cn.telecom.Thread;

public class Client {
    public static void main(String[] args) {
        Fruite fr = new Fruite();
        fr.isExcist = false;
        fr.setName("苹果");
        ProdcutFruite pf = new ProdcutFruite(fr);
        BuyFruite bf = new BuyFruite(fr);
        Thread th1 = new Thread(pf);
        Thread th2 = new Thread(bf);
        th1.start();
        th2.start();


    }
}
