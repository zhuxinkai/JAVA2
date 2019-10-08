package cn.tx;
import java.util.Scanner;
public class DemoStr3 {
    public static void main(String[] args){



    callMethod();
    }

    public static void callMethod(){

        try{
            firstUpper();

        }catch (Exception e){
            System.out.println("请输入字符");
            callMethod();


        }


    }

    public static void firstUpper(){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
       //在获取第一个字符得过程中，可能会存在异常。如果出现异常，就向上抛出。

        //String result = str.substring(0,1).toUpperCase().concat( str.substring(1).toLowerCase());
        String result = str.substring(0,1).
                                   toUpperCase()  +
                                   str.substring(1).
                                    toLowerCase();

        //if(firstchar >='a' && firstchar <= 'z'){
        //   firstchar = firstchar-32;

        //}
           System.out.println(result);












 }
}
