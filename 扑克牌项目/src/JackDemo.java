import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class JackDemo {
    public static void main (String [] args){
        List<Jack> jc = new ArrayList<Jack>();

        for (int j = 0 ; j < 4; j++){
            for (int i = 1; i<14; i++){
            if (j== 0){
                jc.add(new Jack("黑桃",i+""));


            }else if(j == 1){
                jc.add(new Jack("红桃",i+""));
            }else if(j == 2){
                jc.add(new Jack("梅花",i+""));
            }else if (j == 3) {
                jc.add(new Jack("方块",i+""));
            }


            }


        }
        jc.add(new Jack("大王",3+""));
        jc.add(new Jack("小王",4+""));
       //对牌进行替换
        for(Jack jj : jc){
            if(jj.getNo().equals("1")){
                jj.setNo("A");
            }else if(jj.getNo().equals("11")){
                jj.setNo("J");
            }else if(jj.getNo().equals("12")){
                jj.setNo("Q");
            }else if(jj.getNo().equals("13")){
                jj.setNo("K");
            }

        }


        System.out.println(jc);
       //洗牌
        shuffeJack(jc);
        System.out.println(jc);
       //取一张牌
        System.out.println(getJack(jc));




    }



    public static void shuffeJack(List<Jack> jc){
        Collections.shuffle(jc);

    }


    public static Jack getJack(List<Jack> jc){
        Random r = new Random();
        int n = r.nextInt(55);
        return(jc.get(n+1));

    }
}
