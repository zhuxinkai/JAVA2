package  cn.tx;
import java.util.Scanner;
public class DemoString5 {
    public static void main(String[] args){
        String str = "liadfaliliasdfjasliasdliasliasdlidfliasdfasdfliasdflidfliasdfliasdflililioli";
        int i = 0;
        int j = 0;
        while(i != -1){
            i = str.indexOf("li",i+1);
            j++;




        }
        System.out.println("li出现的次数为  " +j);
    }
}
