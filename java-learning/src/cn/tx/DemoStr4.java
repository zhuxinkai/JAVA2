package cn.tx;
import java.util.Scanner;

public class DemoStr4 {
    public static void main (String[] args){
    String str1 = "999-555-333-555-kkk";
    String [] strarray = str1.split("-");
    for (int i = 0;i<strarray.length;i++){
        System.out.println(strarray[i]);

    }
    //    String str2 = "5355231\555gs*\333adf\55asd5*";
    //对特殊字符进行了转义“\\”。
       // String [] strarray2 = str2.split("\");
       // for (int i = 0;i<strarray2.length;i++){
      //      System.out.println(strarray2[i]);

       // }
        String str3 = "99dfqwe9$55weW5$33SDD35$SDASD55$QWEkkk";
        String [] strarray3 = str3.split("\\$");
        for (int i = 0;i<strarray3.length;i++){
            System.out.println(strarray3[i]);

        }



    }
}
